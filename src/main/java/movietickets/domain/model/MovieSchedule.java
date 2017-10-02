package movietickets.domain.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by zeus on 9/28/17.
 */

@Entity
public class MovieSchedule {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne
    @NotNull
    private Cinema cinema;

    @Column( length = 10000 )
    private Seats[][] seats;

    @ManyToOne
    @NotNull
    private Movie movie;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime start;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime end;

    @Version
    private Long version;

    public MovieSchedule(Cinema cinema, Movie movie, LocalDate date, LocalTime start) {
        this.cinema = cinema;
        this.movie = movie;
        this.date = date;

        this.start = start;
        this.end = start.plusHours(movie.getRunningTimeMinutes());
    }

    public Long getId() {
        return id;
    }

    public MovieSchedule() {

    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
        this.seats = populateSeats(cinema);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
        this.end = start.plusMinutes(movie.getRunningTimeMinutes());
    }

    public LocalTime getEnd() {
        return end;
    }

    public Seats[][] getSeats() {
        return seats;
    }

    public void setSeats(Seats[][] seats) {
        this.seats = seats;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieSchedule that = (MovieSchedule) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cinema != null ? !cinema.equals(that.cinema) : that.cinema != null) return false;
        if (!Arrays.deepEquals(seats, that.seats)) return false;
        if (movie != null ? !movie.equals(that.movie) : that.movie != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        return version != null ? version.equals(that.version) : that.version == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cinema != null ? cinema.hashCode() : 0);
        result = 31 * result + Arrays.deepHashCode(seats);
        result = 31 * result + (movie != null ? movie.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }

    public int getAvailableSeatCount() {
        int count = 0;
        for(int x = 0; x < this.seats.length; x++) {
            for(int y = 0; y < this.seats[x].length; y++) {
                if(!this.seats[x][y].isReserved() && this.seats[x][y].isEnabled()) {
                    count++;
                }
            }
        }
        return count;
    }

    private Seats[][] populateSeats(Cinema cinema) {
        boolean[][] cinemaSeats = cinema.getSeats();
        Seats[][] availableSeats = new Seats[cinemaSeats.length][cinemaSeats[0].length];
        for(int x = 0; x < cinemaSeats.length; x++) {
            for(int y = 0; y < cinemaSeats[x].length; y++) {
                availableSeats[x][y] = new Seats(cinemaSeats[x][y], false);
            }
        }
        return availableSeats;
    }
}

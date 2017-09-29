package movietickets.domain.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

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
    private Cinema cinema;

    @ManyToOne
    private Movie movie;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime start;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime end;

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

    public void setEnd(LocalTime end) {
        this.end = end;
    }
}

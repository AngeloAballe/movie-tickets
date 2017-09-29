package movietickets;

import movietickets.application.MovieApplicationService;
import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zeus on 9/27/17.
 */
@SpringBootApplication
public class MovieTicketApplication implements CommandLineRunner {

    @Autowired
    MovieApplicationService movieApplicationService;


    public static void main(String[] args) {
        SpringApplication.run(MovieTicketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        boolean[][] seats = {
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true}
        };

        Cinema cinema = new Cinema("Cinema First", seats);

        movieApplicationService.addCinema(cinema);

        Movie movie = new Movie("Inception", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi cupiditate explicabo molestiae molestias natus nemo nobis, odit. Accusantium consectetur, culpa dolorem doloribus ducimus fugit harum, impedit inventore, maiores provident voluptatum.");

        movieApplicationService.addMovie(movie);
    }
}

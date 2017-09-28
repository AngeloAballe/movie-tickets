package movietickets.application;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;

import java.util.List;

/**
 * Created by zeus on 9/29/17.
 */
public interface MovieApplicationService {
    List<Cinema> findAllCinema();

    void addCinema(Cinema cinema);

    List<Movie> findAllMovie();

    void addMovie(Movie movie);
}

package movietickets.application;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.CinemaJpaRepository;
import movietickets.domain.model.Movie;
import movietickets.domain.model.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zeus on 9/29/17.
 */
@Component
@Transactional
public class MovieApplicationServiceImpl implements MovieApplicationService {
    private CinemaJpaRepository cinemaJpaRepository;
    private MovieJpaRepository movieJpaRepository;

    @Autowired
    public MovieApplicationServiceImpl(CinemaJpaRepository cinemaJpaRepository, MovieJpaRepository movieJpaRepository) {
        super();
        this.cinemaJpaRepository = cinemaJpaRepository;
        this.movieJpaRepository = movieJpaRepository;
    }


    @Transactional(readOnly=true)
    @Override
    public Cinema findCinemaById(String id) {
        return cinemaJpaRepository.findById(id);
    }

    @Transactional(readOnly=true)
    @Override
    public List<Cinema> findAllCinema() {
        return cinemaJpaRepository.findAll();
    }

    @Override
    public void addCinema(Cinema cinema) {
        cinemaJpaRepository.insert(cinema);
    }

    @Override
    public void updateCinema(Cinema cinema) {
        cinemaJpaRepository.update(cinema);
    }

    @Override
    public void deleteCinema(Cinema cinema) {
        cinemaJpaRepository.delete(cinema);
    }

    @Transactional(readOnly=true)
    @Override
    public List<Movie> findAllMovie() {
        return movieJpaRepository.findAll();
    }

    @Override
    public void addMovie(Movie movie) {
        movieJpaRepository.insert(movie);
    }
}

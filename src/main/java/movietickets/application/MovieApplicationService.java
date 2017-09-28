package movietickets.application;

import movietickets.domain.model.Cinema;

import java.util.List;

/**
 * Created by zeus on 9/29/17.
 */
public interface MovieApplicationService {
    List<Cinema> findAllCinema();

    void addCinema(Cinema cinema);
}

package movietickets.web;

import movietickets.domain.model.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + AdminController.PATH)
public class MovieController {
    public static final String PATH = "movie";

    private MovieJpaRepository movieJpaRepository;

    @Autowired
    public MovieController(MovieJpaRepository movieJpaRepository) {
        this.movieJpaRepository = movieJpaRepository;
    }

}

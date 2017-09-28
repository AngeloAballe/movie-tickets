package movietickets.web;

import movietickets.application.MovieApplicationService;
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

    private MovieApplicationService movieApplicationService;

    @Autowired
    public MovieController(MovieApplicationService movieApplicationService) {
        this.movieApplicationService = movieApplicationService;
    }
}

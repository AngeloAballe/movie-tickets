package movietickets.web;

import movietickets.infrastructure.jpa.CinemaJpaRepository;
import movietickets.infrastructure.jpa.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by zeus on 9/28/17.
 */

@Controller
@RequestMapping("/" + DashboardController.PATH)
public class DashboardController {
    public static final String PATH = "dashboard";

    private CinemaJpaRepository cinemaJpaRepository;
    private MovieJpaRepository movieJpaRepository;

    @Autowired
    public DashboardController(CinemaJpaRepository cinemaJpaRepository, MovieJpaRepository movieJpaRepository) {
        this.cinemaJpaRepository = cinemaJpaRepository;
        this.movieJpaRepository = movieJpaRepository;
    }

    @RequestMapping(method=GET)
    public String index(Model model) {
        model.addAttribute("cinemas", cinemaJpaRepository.findAll());
        model.addAttribute("movies", movieJpaRepository.findAll());
        return PATH + "/index";
    }
}

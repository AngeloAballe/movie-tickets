package movietickets.web;

import movietickets.infrastructure.jpa.CinemaJpaRepository;
import movietickets.infrastructure.jpa.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/28/17.
 */

@Controller
@RequestMapping("/" + AdminController.PATH)
public class AdminController {
    public static final String PATH = "admin";

    private CinemaJpaRepository cinemaJpaRepository;
    private MovieJpaRepository movieJpaRepository;

    @Autowired
    public AdminController(CinemaJpaRepository cinemaJpaRepository, MovieJpaRepository movieJpaRepository) {
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

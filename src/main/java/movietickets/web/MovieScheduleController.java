package movietickets.web;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import movietickets.domain.model.MovieSchedule;
import movietickets.infrastructure.jpa.CinemaJpaRepository;
import movietickets.infrastructure.jpa.MovieJpaRepository;
import movietickets.infrastructure.jpa.MovieScheduleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + MovieScheduleController.PATH)
public class MovieScheduleController {
    public static final String PATH = "movieSchedule";

    private CinemaJpaRepository cinemaJpaRepository;
    private MovieJpaRepository movieJpaRepository;
    private MovieScheduleJpaRepository movieScheduleJpaRepository;

    @Autowired
    public MovieScheduleController(CinemaJpaRepository cinemaJpaRepository, MovieJpaRepository movieJpaRepository, MovieScheduleJpaRepository movieScheduleJpaRepository) {
        this.cinemaJpaRepository = cinemaJpaRepository;
        this.movieJpaRepository = movieJpaRepository;
        this.movieScheduleJpaRepository = movieScheduleJpaRepository;
    }

    @ModelAttribute("movieSchedules")
    protected List<MovieSchedule> listMovieSchedule() {
        return movieScheduleJpaRepository.findAll();
    }


    @RequestMapping(method=GET)
    public String index(Model model) {
        return PATH + "/list";
    }

    @RequestMapping(method=GET, path = "/create")
    public String createMovieSchedule(Model model) {
        model.addAttribute("movieSchedule", new MovieSchedule());
        model.addAttribute("cinemas", cinemaJpaRepository.findAll());
        model.addAttribute("movies", movieJpaRepository.findAll());
        return PATH + "/add";
    }

    @RequestMapping(method=POST, path = "/create")
    public String saveMovieSchedule(@Valid @ModelAttribute("movieSchedule") MovieSchedule movieSchedule, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("cinemas", cinemaJpaRepository.findAll());
            model.addAttribute("movies", movieJpaRepository.findAll());
            return PATH + "/add";
        }

        movieScheduleJpaRepository.save(movieSchedule);
        return "redirect:/" + PATH;
    }
}

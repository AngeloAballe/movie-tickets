package movietickets.web;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + MovieScheduleController.PATH + "/{id}")
public class MovieScheduleOneController {
    public static final String PATH = MovieScheduleController.PATH;

    private CinemaJpaRepository cinemaJpaRepository;
    private MovieJpaRepository movieJpaRepository;
    private MovieScheduleJpaRepository movieScheduleJpaRepository;

    @Autowired
    public MovieScheduleOneController(CinemaJpaRepository cinemaJpaRepository, MovieJpaRepository movieJpaRepository, MovieScheduleJpaRepository movieScheduleJpaRepository) {
        this.cinemaJpaRepository = cinemaJpaRepository;
        this.movieJpaRepository = movieJpaRepository;
        this.movieScheduleJpaRepository = movieScheduleJpaRepository;
    }

    @ModelAttribute("movieSchedule")
    protected MovieSchedule findMovieSchedule(@PathVariable("id") Long id) {
        return movieScheduleJpaRepository.findById(id);
    }

    @RequestMapping(method=GET)
    public String showMovieSchedule(Model model) {
        return PATH + "/show";
    }

    @RequestMapping(method=GET, path = "/edit")
    public String editMovieSchedule(Model model) {
        model.addAttribute("cinemas", cinemaJpaRepository.findAll());
        model.addAttribute("movies", movieJpaRepository.findAll());
        return PATH + "/edit";
    }

    @RequestMapping(method=POST, path = "/update")
    public String updateMovieSchedule(@Valid @ModelAttribute("movieSchedule") MovieSchedule movieSchedule, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/edit";
        }

        movieScheduleJpaRepository.save(movieSchedule);
        return "redirect:/" + PATH + "/" + movieSchedule.getId();
    }

    @RequestMapping(path = "/delete")
    public String deleteMovieSchedule(@ModelAttribute("movieSchedule") MovieSchedule movieSchedule, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/" + PATH;
        }

        movieScheduleJpaRepository.delete(movieSchedule);
        return "redirect:/" + PATH;
    }

    @RequestMapping(path = "/book")
    public String bookMovie(@PathVariable("id") Long id, Model model) {
        return PATH + "/book";
    }

    @RequestMapping(method=POST, path = "/book")
    public String bookMovie(@Valid @ModelAttribute("movieSchedule") MovieSchedule movieSchedule, BindingResult bindingResult,  @RequestParam(value = "version2", required=false) Long version2, Model model) {
        if (movieScheduleJpaRepository.findById(movieSchedule.getId()).getVersion() - 1L != version2) {
            model.addAttribute("error", "Somebody booked before you! Try Again!");
            bindingResult.reject("error");
            return PATH + "/book";
        }

        System.out.println(movieScheduleJpaRepository.findById(movieSchedule.getId()).getVersion());

        if (bindingResult.hasErrors()) {
            return PATH + "/book";
        }

        movieScheduleJpaRepository.save(movieSchedule);
        return "redirect:/" + PATH + "/";
    }

}

package movietickets.web;

import movietickets.domain.model.Movie;
import movietickets.infrastructure.jpa.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + MovieController.PATH)
public class MovieController {
    public static final String PATH = "movie";

    private MovieJpaRepository movieJpaRepository;

    @Autowired
    public MovieController(MovieJpaRepository movieJpaRepository) {
        this.movieJpaRepository = movieJpaRepository;
    }

    @ModelAttribute("movie")
    protected Movie newMovie() {
        return new Movie("", "", 0);
    }

    @ModelAttribute("movies")
    protected List<Movie> listMovies() {
        return movieJpaRepository.findAll();
    }

    @RequestMapping(method=GET)
    public String index(Model model) {
        return PATH + "/list";
    }

    @RequestMapping(method=GET, path = "/create")
    public String createMovie(Model model) {
        return PATH + "/add";
    }


    @RequestMapping(method=POST, path = "/create")
    public String saveCinema(@ModelAttribute("movie") Movie movie, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/add";
        }

        movieJpaRepository.save(movie);
        return "redirect:/" + PATH;
    }
}

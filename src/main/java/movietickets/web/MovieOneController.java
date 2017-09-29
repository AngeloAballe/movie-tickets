package movietickets.web;

import movietickets.domain.model.Movie;
import movietickets.infrastructure.jpa.MovieJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + MovieController.PATH + "/{id}")
public class MovieOneController {
    public static final String PATH = MovieController.PATH;

    private MovieJpaRepository movieJpaRepository;

    @Autowired
    public MovieOneController(MovieJpaRepository movieJpaRepository) {
        this.movieJpaRepository = movieJpaRepository;
    }

    @ModelAttribute("movie")
    protected Movie findMovie(@PathVariable("id") Long id) {
        return movieJpaRepository.findById(id);
    }

    @RequestMapping(method=GET)
    public String showMovie(Model model) {
        return PATH + "/show";
    }

    @RequestMapping(method=GET, path = "/edit")
    public String editMovie(Model model) {
        return PATH + "/edit";
    }

    @RequestMapping(method=POST, path = "/update")
    public String updateMovie(@ModelAttribute("movie") Movie movie, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/edit";
        }

        movieJpaRepository.save(movie);
        return "redirect:/" + PATH + "/" + movie.getId();
    }

    @RequestMapping(path = "/delete")
    public String deleteMovie(@ModelAttribute("movie") Movie movie, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/" + PATH;
        }

        movieJpaRepository.delete(movie);
        return "redirect:/" + PATH;
    }
}

package movietickets.web;

import movietickets.application.MovieApplicationService;
import movietickets.domain.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + CinemaController.PATH + "/{id}")
public class CinemaOneController {
    public static final String PATH = CinemaController.PATH;

    private MovieApplicationService movieApplicationService;

    @Autowired
    public CinemaOneController(MovieApplicationService movieApplicationService) {
        this.movieApplicationService = movieApplicationService;
    }

    @ModelAttribute("cinema")
    protected Cinema findCinema(@PathVariable("id") String id) {
        return movieApplicationService.findCinemaById(id);
    }

    @RequestMapping(method=GET, path = "/edit")
    public String editCinema(Model model) {
        return PATH + "/edit";
    }

    @RequestMapping(method=POST, path = "/update")
    public String updateCinema(@ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/edit";
        }

        movieApplicationService.updateCinema(cinema);
        return "redirect:/" + AdminController.PATH;
    }

    @RequestMapping(path = "/delete")
    public String deleteCinema(@ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/" + AdminController.PATH;
        }

        movieApplicationService.deleteCinema(cinema);
        return "redirect:/" + AdminController.PATH;
    }
}

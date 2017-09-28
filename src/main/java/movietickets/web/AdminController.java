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
 * Created by zeus on 9/28/17.
 */

@Controller
@RequestMapping("/" + AdminController.PATH)
public class AdminController {
    public static final String PATH = "admin";

    private MovieApplicationService movieApplicationService;

    @Autowired
    public AdminController(MovieApplicationService movieApplicationService) {
        this.movieApplicationService = movieApplicationService;
    }

    @RequestMapping(method=GET)
    public String index(Model model) {
        model.addAttribute("cinemas", movieApplicationService.findAllCinema());
        model.addAttribute("movies", movieApplicationService.findAllMovie());
        return PATH + "/index";
    }
}

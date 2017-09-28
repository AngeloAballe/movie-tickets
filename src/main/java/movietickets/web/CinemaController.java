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
@RequestMapping("/" + CinemaController.PATH)
public class CinemaController {
    public static final String PATH = "cinema";

    private MovieApplicationService movieApplicationService;

    @Autowired
    public CinemaController(MovieApplicationService movieApplicationService) {
        this.movieApplicationService = movieApplicationService;
    }

    @ModelAttribute("cinema")
    protected Cinema newCinema() {
        boolean[][] seat = new boolean[10][10];
        for (boolean[] row: seat)
            Arrays.fill(row, true);

        return new Cinema(seat);
    }

    @RequestMapping(method=GET, path = "/create")
    public String createCinema(Model model) {
        return PATH + "/add";
    }


    @RequestMapping(method=POST, path = "/create")
    public String saveCinema(@ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/add";
        }

        movieApplicationService.addCinema(cinema);
        return "redirect:/" + AdminController.PATH;
    }
}

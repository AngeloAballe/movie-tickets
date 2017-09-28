package movietickets.web;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.CinemaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Autowired
    public AdminController(CinemaJpaRepository cinemaJpaRepository) {
        this.cinemaJpaRepository = cinemaJpaRepository;
    }

    protected List<Cinema> findAllCinema() {
        return cinemaJpaRepository.findAll();
    }

    @RequestMapping(method=GET)
    public String index(Model model) {
        model.addAttribute("cinemas", findAllCinema());
        return PATH + "/index";
    }

    @RequestMapping(method=GET, path = "/createCinema")
    public String createCinema(Model model) {
        return PATH + "/add";
    }

    @RequestMapping(method=POST, path = "/createCinema")
    public String saveCinema(@ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/add";
        }

        cinemaJpaRepository.insert(cinema);
        return "redirect:/" + PATH;
    }

    @ModelAttribute("cinema")
    protected Cinema newCinema() {
        boolean[][] seat = new boolean[10][10];
        for (boolean[] row: seat)
            Arrays.fill(row, true);

        return new Cinema(seat);
    }
}
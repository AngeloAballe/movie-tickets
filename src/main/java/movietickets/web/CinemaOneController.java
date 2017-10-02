package movietickets.web;

import movietickets.domain.model.Cinema;
import movietickets.infrastructure.jpa.CinemaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/" + CinemaController.PATH + "/{id}")
public class CinemaOneController {
    public static final String PATH = CinemaController.PATH;

    private CinemaJpaRepository cinemaJpaRepository;

    @Autowired
    public CinemaOneController(CinemaJpaRepository cinemaJpaRepository) {
        this.cinemaJpaRepository = cinemaJpaRepository;
    }

    @ModelAttribute("cinema")
    protected Cinema findCinema(@PathVariable("id") Long id) {
        return cinemaJpaRepository.findById(id);
    }

    @RequestMapping(method=GET)
    public String showCinema(Model model) {
        return PATH + "/show";
    }

    @RequestMapping(method=GET, path = "/edit")
    public String editCinema(Model model) {
        return PATH + "/edit";
    }

    @RequestMapping(method=POST, path = "/update")
    public String updateCinema(@Valid @ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return PATH + "/edit";
        }

        cinemaJpaRepository.save(cinema);
        return "redirect:/" + PATH + "/" + cinema.getId();
    }

    @RequestMapping(path = "/delete")
    public String deleteCinema(@ModelAttribute("cinema") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/" + PATH;
        }

        cinemaJpaRepository.delete(cinema);
        return "redirect:/" + PATH;
    }
}

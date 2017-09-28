package movietickets.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by zeus on 9/29/17.
 */
@Controller
@RequestMapping("/")
public class PageController {
    @RequestMapping(method=GET)
    public String index(Model model) {
        return "index";
    }
}

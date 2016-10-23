package pl.edu.uj.jengui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("helloMessage", "Hello");
        model.addAttribute("hiMessage", "World");

        return "home";
    }

    @RequestMapping("/home")
    public String home() {
        return "redirect:/";
    }

}

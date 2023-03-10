package kg.edu.alatoo.tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false,
            defaultValue = "noname") String name, @RequestParam(name = "surname", required = false,
            defaultValue = "sur") String surname, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        return "greeting";
    }
}

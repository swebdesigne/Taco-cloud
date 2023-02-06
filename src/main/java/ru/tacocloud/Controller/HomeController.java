package ru.tacocloud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("test", "Hello world!!!");
        return "home";
    }
}

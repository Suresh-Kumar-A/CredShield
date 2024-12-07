package app.web.credshield.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@RestController
public class GlobalController {

    @GetMapping("/sign-up")
    public ModelAndView signUp() {
        return new ModelAndView("sign-up");
    }
}

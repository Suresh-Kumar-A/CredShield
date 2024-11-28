package app.web.credshield.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping("/ui")
public class SignUpController {

    @GetMapping("/signup")
    ModelAndView showSignUpPage() {
        return new ModelAndView("sign-up");
    }
}

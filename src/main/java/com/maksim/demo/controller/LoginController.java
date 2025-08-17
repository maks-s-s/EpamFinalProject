package com.maksim.demo.controller;

import com.maksim.demo.model.User;
import com.maksim.demo.repository.UserRepository;
import com.maksim.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping
    public String loginPage() {
        return "login";
    }

//    @PostMapping
//    public String login(RedirectAttributes redirectAttributes,
//                        @RequestParam String email,
//                        @RequestParam String password) {
//        User userFromDB = userService.findByEmail(email);
//        if (userFromDB == null) {
//            redirectAttributes.addFlashAttribute("error", "Cannot find user");
//            return "redirect:/login";
//        }
//        if (passwordEncoder.matches(password, userFromDB.getPassword())) {
//            return "redirect:/home";
//        } else {
//            redirectAttributes.addFlashAttribute("error", "Wrong password");
//            return "redirect:/login";
//        }
//    }
}

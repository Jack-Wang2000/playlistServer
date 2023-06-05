package com.OnegJack.playlistback.controllers;

import com.OnegJack.playlistback.domain.*;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Resource
    UserRepository userRepository;

    @RequestMapping(value = "/login")
    public String login(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getAllErrors().get(0).getCode();
        }
/*        if (userRepository.existsById(user.getId())) {
            return "success";
        }*/
        userRepository.save(user);
        return "success";
    }
}

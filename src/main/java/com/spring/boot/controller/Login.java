package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
    @GetMapping("/login")
    public String doStudy() {
        return "login/login";
    }
    @GetMapping("/member_join")
    public String doMember_join() {
        return "login/member_join";
    }
}

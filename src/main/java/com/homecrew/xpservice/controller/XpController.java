package com.homecrew.xpservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xp")
public class XpController {

    @GetMapping("/test")
    public String test() {
        return "XP Service is working";
    }
}

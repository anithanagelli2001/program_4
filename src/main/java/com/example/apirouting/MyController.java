package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    MyService myService = new MyService();

    @GetMapping("/")
    public String getHomePage() {
        return myService.getHomePage();
    }

    @GetMapping("/about")
    public String getAboutPage() {
        return myService.getAboutPage();
    }
}

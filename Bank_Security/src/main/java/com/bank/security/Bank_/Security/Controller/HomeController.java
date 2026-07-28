package com.bank.security.Bank_.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
    public String home() {
        return "Welcome";
    }

    @GetMapping("/profile")
    public String profile() {
        return "My Profile";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Panel";
    }
}

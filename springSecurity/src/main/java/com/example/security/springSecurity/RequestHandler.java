package com.example.security.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	@GetMapping("/")
    public String welcome() {
        return "<h1>welcome</h1>";
    }
}

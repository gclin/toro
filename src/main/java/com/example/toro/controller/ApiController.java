package com.example.toro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/fetch")
    public ResponseEntity<String> fetch() {
        return ResponseEntity.ok("fetch");
    }

    @ResponseBody
    @GetMapping("/user/{username}")
    public Map<String, String> getUser(@PathVariable String username) {
        Map<String, String> userData = new HashMap<>();
        userData.put("username", username);
        return userData;
    }
}

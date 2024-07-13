package com.example.sample_springboot_app;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity<String> getUsers(
            @RequestParam(value = "grade", required = false) final String grade
    ) {
        return ResponseEntity.ok().body("Hello, world");
    }
}

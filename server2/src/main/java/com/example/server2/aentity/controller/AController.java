package com.example.server2.aentity.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping("/")
    public ResponseEntity test(
            // request Dto
    ) {
        // Response Dto Stub
        return ResponseEntity.ok().body("Response Dto");
    }
}

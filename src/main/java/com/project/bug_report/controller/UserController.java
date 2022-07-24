package com.project.bug_report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @PostMapping(value = "/join")
    public ResponseEntity<?> joinMember() {
        return null;
    }

    @GetMapping(value = "/info/{user-id}")
    public ResponseEntity<?> getUserInfoById() {
        return null;
    }
}

package com.project.bug_report.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping(value = "/users/join")
    public Map<String, Object> joinMember() {
        return new HashMap<String, Object>() {{
            put("sample join", "sample");
        }};
    }
}

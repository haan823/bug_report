package com.project.bug_report.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/replies")
public class ReplyController {

    @GetMapping(value = "/product/reply")
    public Map<String, Object> example1() {
        HashMap<String, Object> sample = new HashMap<>();

        sample.put("sample1", "reply sample");

        return sample;
    }
}

package com.project.bug_report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/replies")
public class ReplyController {

    @GetMapping(value = "/{report-id}")
    public ResponseEntity<?> getRepliesByReportId() {
        return null;
    }

    @PostMapping(value = "/satisfaction")
    public ResponseEntity<?> setSatisfactionLevel() {
        return null;
    }
}

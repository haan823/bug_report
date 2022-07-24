package com.project.bug_report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reports")
public class ReportController {

    @PostMapping(value = "/items")
    public ResponseEntity<?> reportBugByItems() { return null; }

    @PostMapping(value = "/categories")
    public ResponseEntity<?> reportBugByCategories() {
        return null;
    }

    @PostMapping(value = "/discretion")
    public ResponseEntity<?> reportBugAtDiscretion() { return null; }

    @GetMapping(value = "/public/all")
    public ResponseEntity<?> getAllReports() { return null; }

    @GetMapping(value = "/public/categories")
    public ResponseEntity<?> getReportsByCategories() { return null; }

    @GetMapping(value = "/public/keywords")
    public ResponseEntity<?> getReportsByKeywords() { return null; }

    @GetMapping(value = "/private/{user-id}")
    public ResponseEntity<?> getPrivateReportsByUserId() { return null; }

    @GetMapping(value = "/{report-id}")
    public ResponseEntity<?> getSingleReportById() { return null; }

    @DeleteMapping(value = "/{report-id}")
    public ResponseEntity<?> removeSingleReportById() { return null; }

    @PutMapping(value = "/{report-id}")
    public ResponseEntity<?> editSingleReportById() { return null; }
}

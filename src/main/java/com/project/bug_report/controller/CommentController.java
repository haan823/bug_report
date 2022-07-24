package com.project.bug_report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/comments")
public class CommentController {

    @PostMapping(value = "/single/{report-id}")
    public ResponseEntity<?> writeSingleComment() { return null; }

    @PostMapping(value = "/nested/{comment-id}")
    public ResponseEntity<?> writeNestedComment() { return null; }

    @PutMapping(value = "/single/{report-id}")
    public ResponseEntity<?> editSingleComment() { return null; }

    @PutMapping(value = "/nested/{comment-id}")
    public ResponseEntity<?> editNestedComment() { return null; }

    @GetMapping(value = "/single/{report-id}")
    public ResponseEntity<?> getSingleComment() { return null; }

    @GetMapping(value = "/nested/{comment-id}")
    public ResponseEntity<?> getNestedComments() { return null; }

    @GetMapping(value = "/{user-id}")
    public ResponseEntity<?> getAllCommentsByUserId() { return null; }

    @DeleteMapping(value = "/single/{comment-id}")
    public ResponseEntity<?> removeSingleComment() { return null; }

    @DeleteMapping(value = "/nested/{nested-comment-id}")
    public ResponseEntity<?> removeNestedComment() { return null; }
}

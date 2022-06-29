package com.project.bug_report.repository.review;

import com.project.bug_report.model.review.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommentRepository extends JpaRepository<UserComment, Long> {
}

package com.project.bug_report.repository.review;

import com.project.bug_report.model.review.NestedComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NestedCommentRepository extends JpaRepository<NestedComment, Long> {
}

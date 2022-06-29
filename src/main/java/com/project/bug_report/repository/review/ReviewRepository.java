package com.project.bug_report.repository.review;

import com.project.bug_report.model.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

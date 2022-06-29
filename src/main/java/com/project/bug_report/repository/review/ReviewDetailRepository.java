package com.project.bug_report.repository.review;

import com.project.bug_report.model.review.ReviewDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDetailRepository extends JpaRepository<ReviewDetail, Long> {
}

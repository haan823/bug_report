package com.project.bug_report.repository.item;

import com.project.bug_report.model.product.CompanyReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyReplyRepository extends JpaRepository<CompanyReply, Long> {
}

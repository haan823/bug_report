package com.project.bug_report.repository.product;

import com.project.bug_report.model.product.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}

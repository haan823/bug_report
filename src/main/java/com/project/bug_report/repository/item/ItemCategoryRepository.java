package com.project.bug_report.repository.item;

import com.project.bug_report.model.product.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ProductCategory, Long> {
}

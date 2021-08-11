package com.project.bug_report.domain.service_category;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class ServiceCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;

    @Column
    private String category_name;

    @Builder
    public ServiceCategory(String category_name){
        this.category_name = category_name;
    }
}

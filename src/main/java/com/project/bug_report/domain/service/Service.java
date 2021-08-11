package com.project.bug_report.domain.service;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long service_id;

    @Column
    private Long category_id;

    @Column
    private Long company_id;

    @Column
    private String service_name;

    @Column
    private String service_detail;

    @Builder
    public Service(Long category_id, Long company_id, String service_name, String service_detail){
        this.category_id = category_id;
        this.company_id = company_id;
        this.service_name = service_name;
        this.service_detail = service_detail;
    }
}

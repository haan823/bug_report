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
    private Long serviceId;

    @Column
    private Long categoryId;

    @Column
    private Long companyId;

    @Column
    private String serviceName;

    @Column
    private String serviceDetail;

    @Builder
    public Service(Long categoryId, Long companyId, String serviceName, String serviceDetail){
        this.categoryId = categoryId;
        this.companyId = companyId;
        this.serviceName = serviceName;
        this.serviceDetail = serviceDetail;
    }
}

package com.project.bug_report.domain.service;

import com.project.bug_report.domain.company.Company;
import com.project.bug_report.domain.service_category.ServiceCategory;
import jdk.jfr.Category;
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
    @ManyToOne
    private ServiceCategory categoryId;

    @Column
    @ManyToOne
    private Company companyId;

    @Column
    private String serviceName;

    @Column
    private String serviceDetail;

    @Builder
    public Service(ServiceCategory categoryId, Company companyId, String serviceName, String serviceDetail){
        this.categoryId = categoryId;
        this.companyId = companyId;
        this.serviceName = serviceName;
        this.serviceDetail = serviceDetail;
    }
}

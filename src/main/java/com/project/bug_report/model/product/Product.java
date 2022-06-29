package com.project.bug_report.model.product;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    @Column
    /*@ManyToOne*/
    private String categoryId;

    @Column
    /*@ManyToOne*/
    private String companyId;

    @Column
    private String serviceName;

    @Column
    private String serviceDetail;

    /*@Builder
    public Product(ProductCategory categoryId, Company companyId, String serviceName, String serviceDetail){
        this.categoryId = categoryId;
        this.companyId = companyId;
        this.serviceName = serviceName;
        this.serviceDetail = serviceDetail;
    }*/
}

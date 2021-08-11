package com.project.bug_report.domain.company;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;

    @Column
    private String company_name;

    @Column
    private String country;

    @Column
    private String website;

    @Column
    private String company_info;

    @Builder
    public Company(String company_name, String country, String website, String company_info){
        this.company_name = company_name;
        this.country = country;
        this.website = website;
        this.company_info = company_info;
    }
}

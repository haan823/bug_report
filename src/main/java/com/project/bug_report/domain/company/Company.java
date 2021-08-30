package com.project.bug_report.domain.company;

import com.project.bug_report.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Company extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column
    private String companyName;

    @Column
    private String country;

    @Column
    private String website;

    @Column
    private String companyInfo;

    @Builder
    public Company(String companyName, String country, String website, String companyInfo){
        this.companyName = companyName;
        this.country = country;
        this.website = website;
        this.companyInfo = companyInfo;
    }
}

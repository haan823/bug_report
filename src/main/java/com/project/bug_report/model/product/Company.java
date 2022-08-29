package com.project.bug_report.model.product;

import com.project.bug_report.model.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Company extends BaseTimeEntity implements Serializable {

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

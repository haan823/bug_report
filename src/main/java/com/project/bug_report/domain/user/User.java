package com.project.bug_report.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String loginId;
    private String password;
    private Long userType;
    private String name;
    private String email;
    private String phoneNumber;
    private Long modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public User(String loginId, String password, Long userType, String name, String email, String phoneNumber) {
        this.loginId = loginId;
        this.password = password;
        this.userType = userType;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

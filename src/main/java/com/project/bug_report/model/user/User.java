package com.project.bug_report.model.user;

import com.project.bug_report.model.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String loginId;
    private String password;
    private Long userType;
    private String name;
    private String email;
    private String phoneNumber;

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

package com.project.bug_report.repository.user;

import com.project.bug_report.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

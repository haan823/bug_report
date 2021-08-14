package com.project.bug_report.domain.user_comment;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class UserComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentsId;

    private Long userId;
    private Long reviewId;
    private String comments;
    private Long modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public UserComment(Long userId, Long reviewId, String comments) {
        this.userId = userId;
        this.reviewId = reviewId;
        this.comments = comments;
    }
}

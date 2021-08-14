package com.project.bug_report.domain.nested_comment;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class NestedComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nestedCommentId;

    private Long userId;
    private Long commentId;
    private String nestedComment;
    private Long modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public NestedComment(Long userId, Long commentId, String nestedComment) {
        this.userId = userId;
        this.commentId = commentId;
        this.nestedComment = nestedComment;
    }
}

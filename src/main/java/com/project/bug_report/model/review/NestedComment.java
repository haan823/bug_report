package com.project.bug_report.model.review;

import com.project.bug_report.model.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
public class NestedComment extends BaseTimeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nestedCommentId;

    private Long userId;
    private Long commentId;
    private String nestedComment;

    @Builder
    public NestedComment(Long userId, Long commentId, String nestedComment) {
        this.userId = userId;
        this.commentId = commentId;
        this.nestedComment = nestedComment;
    }
}

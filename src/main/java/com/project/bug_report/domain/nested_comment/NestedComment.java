package com.project.bug_report.domain.nested_comment;

import com.project.bug_report.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class NestedComment extends BaseTimeEntity {

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

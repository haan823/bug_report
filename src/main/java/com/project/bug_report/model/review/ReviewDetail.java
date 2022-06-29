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
public class ReviewDetail extends BaseTimeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailId;

    /*private Long reviewId;*/
    private String fileName;
    private String filePath;
    /*private Boolean detailType;*/
    /*private Long order;*/

    /*@Builder
    public ReviewDetail(Long reviewId, String fileName, String filePath, Boolean detailType, Long order) {
        this.reviewId = reviewId;
        this.fileName = fileName;
        this.filePath = filePath;
        this.detailType = detailType;
        this.order = order;
    }*/
}

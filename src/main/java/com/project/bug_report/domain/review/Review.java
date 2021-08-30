package com.project.bug_report.domain.review;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private Long userId;
    private Long serviceId;
    private String textReview;
    private Long status;
    private Long ratings;
    private Boolean openToPublic;
    private Long modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public Review(Long userId, Long serviceId, String textReview, Long status, Long ratings, Boolean openToPublic) {
        this.userId = userId;
        this.serviceId = serviceId;
        this.textReview = textReview;
        this.status = status;
        this.ratings = ratings;
        this.openToPublic = openToPublic;
    }
}

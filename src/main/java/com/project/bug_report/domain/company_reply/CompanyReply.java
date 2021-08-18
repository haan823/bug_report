package com.project.bug_report.domain.company_reply;

import com.project.bug_report.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class CompanyReply extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    @Column
    private Long companyId;

    @Column
    private Long reviewId;

    @Column
    private String reply;

    @Builder
    public CompanyReply(Long companyId, Long reviewId, String reply){
        this.companyId = companyId;
        this.reviewId = reviewId;
        this.reply = reply;
    }
}

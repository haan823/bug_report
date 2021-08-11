package com.project.bug_report.domain.company_reply;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class CompanyReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reply_id;

    @Column
    private Long company_id;

    @Column
    private Long review_id;

    @Column
    private String reply;

    @Builder
    public CompanyReply(Long company_id, Long review_id, String reply){
        this.company_id = company_id;
        this.review_id = review_id;
        this.reply = reply;
    }
}

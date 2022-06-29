package com.project.bug_report.model.product;

import com.project.bug_report.model.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Entity
public class CompanyReply extends BaseTimeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    @Column
    /*@ManyToOne*/
    private String companyId;

    @Column
    private Long reviewId;

    @Column
    private String reply;

    /*@Builder
    public CompanyReply(Company companyId, Long reviewId, String reply){
        this.companyId = companyId;
        this.reviewId = reviewId;
        this.reply = reply;
    }*/
}

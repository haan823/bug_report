package com.project.bug_report.domain.review;

import com.project.bug_report.model.review.Review;
import com.project.bug_report.repository.review.ReviewRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewRepositoryTest {

    @Autowired
    ReviewRepository reviewRepository;

    @After
    public void cleanup(){
        reviewRepository.deleteAll();
    }

    @Test
    public void 리뷰저장_불러오기(){
        //given
        Long userId = 239483L;
        Long serviceId = 398492L;
        String textReview = "리뷰 테스트 내용 12345";
        Long status = 4L;
        Long ratings = 3L;
        Boolean openToPublic = true;

        reviewRepository.save(Review.builder().userId(userId).serviceId(serviceId).textReview(textReview).status(status).ratings(ratings).openToPublic(openToPublic).build());

        //when
        List<Review> reviewList = reviewRepository.findAll();

        //then
        Review review = reviewList.get(0);
        assertThat(review.getUserId()).isEqualTo(userId);
        assertThat(review.getServiceId()).isEqualTo(serviceId);
        assertThat(review.getTextReview()).isEqualTo(textReview);
        assertThat(review.getStatus()).isEqualTo(status);
        assertThat(review.getRatings()).isEqualTo(ratings);
        assertThat(review.getOpenToPublic()).isEqualTo(openToPublic);
    }
}

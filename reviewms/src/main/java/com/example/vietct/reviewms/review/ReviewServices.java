package com.example.vietct.reviewms.review;

import java.util.List;

public interface ReviewServices {
    void createReview(Long companyId, Review review);
    List<Review> getAllReviewByCompanyId(Long companyId);
    Review getReviewById(Long id);
    void updateReviewById(Long id, Review review);
}

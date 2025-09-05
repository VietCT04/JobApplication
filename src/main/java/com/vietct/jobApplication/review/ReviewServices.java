package com.vietct.jobApplication.review;

import java.util.List;

public interface ReviewServices {
    void createReview(Long companyId, Review review);
    List<Review> getAllReviewByCompanyId(Long companyId);
    Review getReviewByIdAndCompanyId(Long companyId, Long id);
    void updateReviewByIdAndCompanyId(Long id, Long companyId, Review review);
}

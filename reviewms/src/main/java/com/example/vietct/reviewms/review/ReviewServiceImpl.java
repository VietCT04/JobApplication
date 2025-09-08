package com.example.vietct.reviewms.review;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewServices{
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void createReview(Long companyId, Review review) {
        review.setCompany(companyId);
        reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReviewByCompanyId(Long companyId) {
        return reviewRepository.findAllByCompanyId(companyId);
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public void updateReviewById(Long id, Review review) {
        Review updatedReview = getReviewById(id);
        updatedReview.setDescription(review.getDescription());
        updatedReview.setRating(review.getRating());
        updatedReview.setTitle(review.getTitle());
        reviewRepository.save(updatedReview);
    }
}

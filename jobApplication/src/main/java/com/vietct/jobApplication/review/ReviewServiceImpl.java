package com.vietct.jobApplication.review;

import com.vietct.jobApplication.company.Company;
import com.vietct.jobApplication.company.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewServices{
    private final ReviewRepository reviewRepository;
    private final CompanyRepository companyRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyRepository companyRepository) {
        this.reviewRepository = reviewRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public void createReview(Long companyId, Review review) {
        Optional<Company> optionalCompany = companyRepository.findById(companyId);
        if (optionalCompany.isPresent()){
            Company company = optionalCompany.get();
            review.setCompany(company);
        }
        reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReviewByCompanyId(Long companyId) {
        return companyRepository.findById(companyId).get().getReviewList();
    }

    @Override
    public Review getReviewByIdAndCompanyId(Long companyId, Long id) {
        return reviewRepository.findByIdAndCompanyId(id, companyId);
    }

    @Override
    public void updateReviewByIdAndCompanyId(Long id, Long companyId, Review review) {
        Review updatedReview = getReviewByIdAndCompanyId(companyId, id);
        updatedReview.setDescription(review.getDescription());
        updatedReview.setRating(review.getRating());
        updatedReview.setTitle(review.getTitle());
        reviewRepository.save(updatedReview);
    }
}

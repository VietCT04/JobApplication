package com.vietct.jobApplication.review;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class ReviewController {
    private final ReviewServices reviewServices;

    public ReviewController(ReviewServices reviewServices) {
        this.reviewServices = reviewServices;
    }

    @PostMapping("/{companyId}/review")
    public ResponseEntity<String> createReview(@PathVariable Long companyId, @RequestBody Review review){
        reviewServices.createReview(companyId, review);
        return new ResponseEntity<>("Created Review Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{companyId}/review")
    public ResponseEntity<List<Review>> getAllReview(@PathVariable Long companyId){
        return new ResponseEntity<List<Review>>(reviewServices.getAllReviewByCompanyId(companyId), HttpStatus.OK);
    }

    @GetMapping("/{companyId}/review/{id}")
    public ResponseEntity<Review> getReviewByIdAndCompanyId(@PathVariable Long companyId, @PathVariable Long id){
        return new ResponseEntity<Review>(reviewServices.getReviewByIdAndCompanyId(companyId, id), HttpStatus.OK);
    }

    @PutMapping("/{companyId}/review/{id}")
    public ResponseEntity<String> updateReviewByIdAndCompanyId(@PathVariable Long companyId, @PathVariable Long id,
                                                               @RequestBody Review review){
        reviewServices.updateReviewByIdAndCompanyId(id, companyId, review);
        return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
    }
}

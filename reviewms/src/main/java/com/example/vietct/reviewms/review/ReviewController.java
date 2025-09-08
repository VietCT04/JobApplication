package com.example.vietct.reviewms.review;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    private final ReviewServices reviewServices;

    public ReviewController(ReviewServices reviewServices) {
        this.reviewServices = reviewServices;
    }

    @PostMapping
    public ResponseEntity<String> createReview(@RequestParam Long companyId, @RequestBody Review review){
        reviewServices.createReview(companyId, review);
        return new ResponseEntity<>("Created Review Successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Review>> getAllReview(@RequestParam Long companyId){
        return new ResponseEntity<List<Review>>(reviewServices.getAllReviewByCompanyId(companyId), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long id){
        return new ResponseEntity<Review>(reviewServices.getReviewById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateReviewByIdAndCompanyId(@PathVariable Long id,
                                                               @RequestBody Review review){
        reviewServices.updateReviewById(id, review);
        return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
    }
}

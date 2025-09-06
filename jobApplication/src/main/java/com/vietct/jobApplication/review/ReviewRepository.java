package com.vietct.jobApplication.review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Review findByIdAndCompanyId(Long id, Long companyId);
}

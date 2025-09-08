package com.example.vietct.reviewms.review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Review findByIdAndCompanyId(Long id, Long companyId);
    List<Review> findAllByCompanyId(Long companyId);
}

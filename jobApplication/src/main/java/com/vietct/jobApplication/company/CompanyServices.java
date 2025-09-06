package com.vietct.jobApplication.company;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface CompanyServices {
    void createCompany(Company company);
    List<Company> findAll();
    void updateCompany(Long id, Company company);
    boolean deleteCompany(Long id);
    Optional<Company> getCompanyById(Long id);
}

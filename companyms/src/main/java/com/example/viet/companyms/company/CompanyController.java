package com.example.viet.companyms.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {
    CompanyServices companyServices;

    public CompanyController(CompanyServices companyServices) {
        this.companyServices = companyServices;
    }

    @PostMapping
    public ResponseEntity<String> createCompany(@RequestBody Company company){
        companyServices.createCompany(company);
        return ResponseEntity.ok("Company Created Successfully!");
    }

    @GetMapping
    public List<Company> showAllCompany(){
        return companyServices.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id, @RequestBody Company company){
        companyServices.updateCompany(id, company);
        return ResponseEntity.ok("Successfully Updated Company");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable Long id){
        if (companyServices.deleteCompany(id)){
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Company Not Found", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable Long id){
        return companyServices.getCompanyById(id);
    }
}

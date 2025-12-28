package com.website.campaings.banner_project.repository;

import com.website.campaings.banner_project.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRepository extends CrudRepository<Company, UUID> {
    Company findByCompanyId(Long companyId);
}

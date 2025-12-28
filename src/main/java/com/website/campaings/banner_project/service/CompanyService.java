package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.CompanyDto;
import com.website.campaings.banner_project.entity.Company;
import com.website.campaings.banner_project.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private static final Logger logger = LogManager.getLogger(CompanyService.class);

    private final CompanyRepository companyRepository;

    public Company addCompany(Company company) {
        company.setId(UUID.randomUUID());
        logger.info("Add company with company id: {}", company.getCompanyId());
        return companyRepository.save(company);
    }

    public List<CompanyDto> getAllCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        if (CollectionUtils.isEmpty(companies)) {
            return null;
        }
        return companies.stream().map(this::toCompanyDto).toList();
    }

    public CompanyDto getCompanyById(Long companyId) {
        logger.info("Get company with company id: {}", companyId);
        Company byCompanyId = companyRepository.findByCompanyId(companyId);
        if (Objects.isNull(byCompanyId)) {
            return null;
        }
        return toCompanyDto(byCompanyId);
    }

    private CompanyDto toCompanyDto(Company company) {
        CompanyDto dto = new CompanyDto();
        dto.setCompanyId(company.getCompanyId());
        dto.setNotes(company.getNotes());
        dto.setCompanyName(company.getCompanyName());
        return dto;
    }
}

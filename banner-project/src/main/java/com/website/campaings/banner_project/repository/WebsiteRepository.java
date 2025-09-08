package com.website.campaings.banner_project.repository;

import com.website.campaings.banner_project.entity.Website;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WebsiteRepository extends CrudRepository<Website, UUID> {

    Website findByWebsiteId(Long websiteId);
}

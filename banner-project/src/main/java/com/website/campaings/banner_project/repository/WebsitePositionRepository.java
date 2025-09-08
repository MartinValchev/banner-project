package com.website.campaings.banner_project.repository;

import com.website.campaings.banner_project.entity.WebsitePosition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WebsitePositionRepository extends CrudRepository<WebsitePosition, UUID> {

    List<WebsitePosition> findByWebsiteId(Long websiteId);
}

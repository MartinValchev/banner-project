package com.website.campaings.banner_project.repository;

import com.website.campaings.banner_project.entity.Campaign;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CampaignRepository extends CrudRepository<Campaign, UUID> {

    @Query("select e from Campaign e WHERE e.company.companyId=?1")
    List<Campaign> findByCompanyId(Long companyId);

    Campaign findByCampaignId(Long campaignId);

}

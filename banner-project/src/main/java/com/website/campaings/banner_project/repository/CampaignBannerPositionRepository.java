package com.website.campaings.banner_project.repository;

import com.website.campaings.banner_project.entity.CampaignBannerPosition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CampaignBannerPositionRepository extends CrudRepository<CampaignBannerPosition, UUID> {

    @Query(value="SELECT bp from CampaignBannerPosition bp "
            + "WHERE bp.websitePosition.website.websiteId=?1"   )
    List<CampaignBannerPosition> findByWebsiteId(Long websiteId);

    @Query(value="SELECT bp from CampaignBannerPosition bp "
            + "WHERE bp.campaign.campaignId=?1"   )
    List<CampaignBannerPosition> findByCampaignId(Long campaignId);

}

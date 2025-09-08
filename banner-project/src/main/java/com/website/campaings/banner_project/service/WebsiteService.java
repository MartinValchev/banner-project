package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.WebsitePositionUsageDto;
import com.website.campaings.banner_project.dto.WebsiteUsageDto;
import com.website.campaings.banner_project.entity.CampaignBannerPosition;
import com.website.campaings.banner_project.repository.CampaignBannerPositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WebsiteService {

    private final CampaignBannerPositionRepository campaignBannerPositionRepository;
    
    public WebsiteUsageDto getWebsiteUsage(Long websiteId, LocalDateTime usageDate) {
        List<CampaignBannerPosition> campaignBannerPositions = campaignBannerPositionRepository.findByWebsiteId(websiteId);
        List<CampaignBannerPosition> usageDatePositions = campaignBannerPositions.stream()
                .filter(cp -> cp.getStartDate().isBefore(usageDate)
                        || cp.getStartDate().isEqual(usageDate)).toList();
        return toWebsiteUsageDto(usageDate, usageDatePositions);

    }
    
    private WebsiteUsageDto toWebsiteUsageDto(LocalDateTime usageDate, List<CampaignBannerPosition> positionsForWebsite ) {
        WebsiteUsageDto dto = new WebsiteUsageDto();
        dto.setWebsiteDomain(positionsForWebsite.get(0).getWebsitePosition().getWebsite().getWebsiteDomain());
        dto.setWebsiteId(positionsForWebsite.get(0).getWebsitePosition().getWebsite().getWebsiteId());
        dto.setUsageDate(usageDate);
        dto.setUsages(positionsForWebsite.stream().map(this::toWebsitePositionUsageDto).toList());
        return dto;
    }
    
    private WebsitePositionUsageDto toWebsitePositionUsageDto(CampaignBannerPosition campaignBannerPosition) {
        WebsitePositionUsageDto dto = new WebsitePositionUsageDto();
        dto.setPositionName(campaignBannerPosition.getWebsitePosition().getPositionName());
        dto.setCurrentImpressions(campaignBannerPosition.getImpressions());
        dto.setExpectedPositionImpressions(campaignBannerPosition.getWebsitePosition().getExpectedImpressions());
        dto.setWebsitePositionId(campaignBannerPosition.getWebsitePosition().getWebsitePositionId());
        return dto;
    }
}

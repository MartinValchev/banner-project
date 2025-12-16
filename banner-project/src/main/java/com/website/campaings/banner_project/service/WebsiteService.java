package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.WebsiteDto;
import com.website.campaings.banner_project.dto.WebsitePositionDto;
import com.website.campaings.banner_project.dto.WebsitePositionUsageDto;
import com.website.campaings.banner_project.dto.WebsiteUsageDto;
import com.website.campaings.banner_project.entity.CampaignBannerPosition;
import com.website.campaings.banner_project.entity.Website;
import com.website.campaings.banner_project.entity.WebsitePosition;
import com.website.campaings.banner_project.repository.CampaignBannerPositionRepository;
import com.website.campaings.banner_project.repository.WebsitePositionRepository;
import com.website.campaings.banner_project.repository.WebsiteRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class WebsiteService {

    private final CampaignBannerPositionRepository campaignBannerPositionRepository;
    private final WebsitePositionRepository websitePositionRepository;
    private final WebsiteRepository websiteRepository;

    public Website addWebsite(Website website) {
        website.setId(UUID.randomUUID());
        return websiteRepository.save(website);
    }

    public WebsiteUsageDto getWebsiteUsage(Long websiteId, LocalDateTime usageDate) {
        List<CampaignBannerPosition> campaignBannerPositions = campaignBannerPositionRepository.findByWebsiteId(websiteId);
        List<CampaignBannerPosition> usageDatePositions = campaignBannerPositions.stream()
                .filter(cp -> cp.getStartDate().isBefore(usageDate)
                        || cp.getStartDate().isEqual(usageDate)).toList();
        return toWebsiteUsageDto(usageDate, usageDatePositions);

    }

    public WebsiteDto getWebsiteById(Long websiteId) {
        Website byWebsiteId = websiteRepository.findByWebsiteId(websiteId);
        if (Objects.isNull(byWebsiteId)) {
            return new WebsiteDto();
        }
        return toWebsiteDto(byWebsiteId);
    }

    public List<WebsiteDto> getAllWebsites() {
        List<Website> byWebsiteId = StreamSupport.stream(websiteRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(byWebsiteId)) {
            return new ArrayList<>();
        }
        return byWebsiteId.stream().map(this::toWebsiteDto).toList();
    }

    public WebsitePosition addWebsitePosition(WebsitePosition websitePosition) {
        websitePosition.setId(UUID.randomUUID());
        return websitePositionRepository.save(websitePosition);
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

    private WebsiteDto toWebsiteDto(Website website) {
        WebsiteDto dto = new WebsiteDto();
        dto.setWebsiteId(website.getWebsiteId());
        dto.setDescription(website.getDescription());
        dto.setWebsiteDomain(website.getWebsiteDomain());
        return dto;
    }

    private WebsitePositionDto websitePositionDto(WebsitePosition websitePosition) {
        WebsitePositionDto dto = new WebsitePositionDto();
        dto.setPositionName(websitePosition.getPositionName());
        dto.setExpectedImpressions(websitePosition.getExpectedImpressions());
        dto.setWebsitePositionId(websitePosition.getWebsitePositionId());
        return  dto;
    }
}

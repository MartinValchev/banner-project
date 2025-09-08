package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.CampaignBannerPositionDto;
import com.website.campaings.banner_project.entity.CampaignBannerPosition;
import com.website.campaings.banner_project.repository.CampaignBannerPositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampaignBannerPositionService {

    private CampaignBannerPositionRepository repository;

    public CampaignBannerPosition addCampaignBannerPosition(CampaignBannerPosition campaignBannerPosition) {
        return repository.save(campaignBannerPosition);
    }

    public List<CampaignBannerPositionDto> getCampaignBannerPositionsByCampaignId(Long campaignId){
        return repository.findByCampaignId(campaignId).stream().map(this::toCampaignBannerPositionDto).toList();
    }

    private CampaignBannerPositionDto toCampaignBannerPositionDto(CampaignBannerPosition campaignBannerPosition) {
        CampaignBannerPositionDto dto = new CampaignBannerPositionDto();
        dto.setBannerId(campaignBannerPosition.getBanner().getBannerId());
        dto.setBannerName(campaignBannerPosition.getBanner().getName());
        dto.setImpressions(campaignBannerPosition.getImpressions());
        dto.setWebsitePositionId(campaignBannerPosition.getWebsitePosition().getWebsitePositionId());
        dto.setWebsitePositionName(campaignBannerPosition.getWebsitePosition().getPositionName());
        dto.setStartDate(campaignBannerPosition.getStartDate());
        dto.setEndDate(campaignBannerPosition.getEndDate());
        dto.setWebsiteName(campaignBannerPosition.getWebsitePosition().getWebsite().getWebsiteDomain());
        return dto;
    }
}

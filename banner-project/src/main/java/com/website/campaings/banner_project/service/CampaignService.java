package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.CampaignDto;
import com.website.campaings.banner_project.dto.CampaignBannerPositionDto;
import com.website.campaings.banner_project.entity.Campaign;
import com.website.campaings.banner_project.entity.CampaignBannerPosition;
import com.website.campaings.banner_project.repository.CampaignRepository;
import com.website.campaings.banner_project.repository.WebsiteRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.stream.Streams;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CampaignService {

    private final CampaignRepository campaignRepository;

    private final WebsiteRepository websiteRepository;

    public List<CampaignDto> getAllCampaigns() {
        return Streams.of(campaignRepository.findAll()).map(this::toCampaignDto).toList();
    }

    public List<CampaignDto> getCompanyCampaigns(Long companyId) {
        List<Campaign> byCompanyId = campaignRepository.findByCompanyId(companyId);
        return Streams.of(byCompanyId).map(campaign -> campaign)
                .map(this::toCampaignDto)
                .toList();
    }

    public List<CampaignDto> getWebsiteCampaigns(Long websiteId) {
        List<Campaign> byCompanyId = campaignRepository.findByCompanyId(websiteId);
        return Streams.of(byCompanyId).map(this::toCampaignDto).toList();
    }

    public CampaignDto getCampaignById(Long campaignId) {
        return toCampaignDto(campaignRepository.findByCampaignId(campaignId));
    }

    public List<CampaignDto> getActiveCampaigns() {
        return Streams.of(campaignRepository.findAll())
                .filter(campaign -> campaign.getStartDate().isAfter(LocalDateTime.now()))
                .map(this::toCampaignDto).toList();
    }

    private CampaignDto toCampaignDto(Campaign campaign) {
        CampaignDto campaignDto = new CampaignDto();
        campaignDto.setCampaignId(campaign.getCampaignId());
        campaignDto.setCampaignName(campaign.getCampaignName());
        campaignDto.setStartDate(campaign.getStartDate());
        campaignDto.setEndDate(campaign.getEndDate());
        campaignDto.setEntryList(campaign.getCampaignBannerPositions().stream().map(this::toCampaignEntry).toList());
        return campaignDto;
    }

    private CampaignBannerPositionDto toCampaignEntry(CampaignBannerPosition position) {
        CampaignBannerPositionDto campaignBannerPositionDto = new CampaignBannerPositionDto();
        campaignBannerPositionDto.setBannerName(position.getBanner().getName());
        campaignBannerPositionDto.setWebsiteId(position.getWebsitePosition().getWebsite().getWebsiteId());
        campaignBannerPositionDto.setWebsiteName(position.getWebsitePosition().getWebsite().getWebsiteDomain());
        campaignBannerPositionDto.setWebsitePositionName(position.getWebsitePosition().getPositionName());
        campaignBannerPositionDto.setWebsitePositionId(position.getWebsitePosition().getWebsitePositionId());
        campaignBannerPositionDto.setBannerId(position.getBanner().getBannerId());
        campaignBannerPositionDto.setStartDate(position.getStartDate());
        campaignBannerPositionDto.setEndDate(position.getEndDate());
        campaignBannerPositionDto.setImpressions(position.getImpressions());
        return campaignBannerPositionDto;
    }

//    private WebsiteDto toWebsiteDto(WebsitePosition websitePosition, Campaign campaign) {
//        WebsiteDto websiteDto = new WebsiteDto();
//        websiteDto.setWebsiteId(websitePosition.getWebsite().getWebsiteId());
//        websiteDto.setWebsiteDomain(websiteDto.getWebsiteDomain());
//        websiteDto.setId(websitePosition.getWebsite().getWebsiteId());
//        websiteDto.setDescription(websitePosition.getWebsite().getDescription());
//        websiteDto.setEntryList();
//        return websiteDto;
//    }
//
//    private WebsiteEntry toWebsiteEntry(WebsitePosition websitePosition, Campaign campaign) {
//        WebsiteEntry websiteEntry = new WebsiteEntry();
//        websiteEntry.setCampaignId(campaign.getCampaignId());
//        websiteEntry.setImpressions(websitePosition.);
//    }
}

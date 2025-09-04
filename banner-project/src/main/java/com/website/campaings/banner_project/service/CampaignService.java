package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.CampaignDto;
import com.website.campaings.banner_project.dto.CampaignEntry;
import com.website.campaings.banner_project.dto.WebsiteDto;
import com.website.campaings.banner_project.repository.CampaignBannerPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {

    @Autowired
    private CampaignBannerPositionRepository repository;

    public List<CampaignEntry> getCompanyCampaigns(Long campaignId) {}

    public List<WebsiteDto> getWebsiteCampaigns(Long websiteId) {}

    public CampaignDto getCampaignById(Long campaignId) {}
}

package com.website.campaings.banner_project.controller;

import com.website.campaings.banner_project.dto.CampaignBannerPositionDto;
import com.website.campaings.banner_project.dto.CampaignDto;
import com.website.campaings.banner_project.dto.WebsitePositionUsageDto;
import com.website.campaings.banner_project.dto.WebsiteUsageDto;
import com.website.campaings.banner_project.entity.*;
import com.website.campaings.banner_project.service.CampaignBannerPositionService;
import com.website.campaings.banner_project.service.CampaignService;
import com.website.campaings.banner_project.service.WebsiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("campaign")
@RequiredArgsConstructor
public class CampaignBannerController {

    private final CampaignService campaignService;
    private final CampaignBannerPositionService campaignBannerPositionService;
    private final WebsiteService websiteService;

    @GetMapping("/all-banners")
    public List<Banner> getAllBanners() {
        //TODO: implement
        return null;
    }

    @PostMapping("/addBanner")
    public Banner addBanner(@RequestBody Banner banner) {
        //TODO: implement
        return null;
    }

// company related

    @PostMapping("/company")
    public Company addCompany(@RequestBody Company company) {
        //TODO: implement
        return null;
    }

    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        //TODO: implement
        return null;
    }

    @GetMapping("/companies/{id}")
    public Company getCompany(@PathVariable ("id") Long id) {
        //TODO: implement
        return null;
    }

// Website related endpoints
    @PostMapping("/website")
    public Website addWebsite(@PathVariable  Website website) {
        //TODO: implement
        return null;
    }

    @PostMapping("/website/position")
    public WebsitePosition addWebsitePosition(@RequestBody WebsitePosition websitePosition) {
        //TODO: implement
        return null;
    }

    @GetMapping("/websites")
    public List<Website> getAllWebsites() {
        //TODO: implement
        return null;
    }

    @GetMapping("/websites/{website_id}/usage")
    public WebsiteUsageDto getWebsiteUsage(@PathVariable Long websiteId, @RequestParam String usageDate) {
        return websiteService.getWebsiteUsage(websiteId, LocalDateTime.parse(usageDate));
    }

    @GetMapping("/websites/{id}")
    public List<Website> getWebsiteById(@PathVariable Long websiteId) {
        //TODO: implement
        return null;
    }
// Campaign related endpoints
    @PostMapping("/campaign")
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        //TODO: implement
        return null;
    }

    @GetMapping("/campaigns/all")
    public List<CampaignDto> getAllCampaigns() {
        return campaignService.getAllCampaigns();
    }

    @GetMapping("/campaigns/companies/{company-id}")
    public List<CampaignDto> getCampaignsByCompany(@RequestParam Long companyId) {
       return campaignService.getCompanyCampaigns(companyId);
    }

    @GetMapping("/campaigns/active")
    public List<CampaignDto> getAllActiveCampaigns() {
        return campaignService.getActiveCampaigns();
    }

    @GetMapping("/campaigns/{campaign-id}/")
    public CampaignDto getCampaignById(@RequestParam Long campaignId) {
        return campaignService.getCampaignById(campaignId);
    }

    @GetMapping("/campaigns/websites/{websiteId}")
    public List<CampaignDto> getCampaignsByWebsiteId(@RequestParam Long websiteId) {
        return campaignService.getWebsiteCampaigns(websiteId);
    }
// Campaign banner position related endpoints

    @PostMapping("/campaign-banner-position/add")
    public CampaignBannerPosition addCampaignBannerPosition(@RequestBody CampaignBannerPosition campaignBannerPosition) {
        return campaignBannerPositionService.addCampaignBannerPosition(campaignBannerPosition);
    }

    @GetMapping("/campaign-banner-positions/campaigns/{campaignId}")
    public List<CampaignBannerPositionDto> getCampaignBannerPositions(@Re Long campaignId) {
        return campaignBannerPositionService.getCampaignBannerPositionsByCampaignId(campaignId);
    }

}

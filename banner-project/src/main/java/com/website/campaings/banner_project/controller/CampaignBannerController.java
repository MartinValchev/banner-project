package com.website.campaings.banner_project.controller;

import com.website.campaings.banner_project.dto.*;
import com.website.campaings.banner_project.entity.*;
import com.website.campaings.banner_project.service.*;
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
    private final BannerService bannerService;
    private final CompanyService companyService;

    @GetMapping("/all-banners")
    public List<BannerDto> getAllBanners() {
        return bannerService.getAllBanners();
    }

    @PostMapping("/addBanner")
    public Banner addBanner(@RequestBody Banner banner) {
        return bannerService.saveBanner(banner);
    }

// company related api

    @PostMapping("/company")
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }

    @GetMapping("/companies")
    public List<CompanyDto> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/companies/{id}")
    public CompanyDto getCompany(@PathVariable("id") Long id) {
        return companyService.getCompanyById(id);
    }

    // Website related endpoints
    @PostMapping("/website")
    public Website addWebsite(@PathVariable Website website) {
        return websiteService.addWebsite(website);
    }

    @PostMapping("/website/position")
    public WebsitePosition addWebsitePosition(@RequestBody WebsitePosition websitePosition) {
        return websiteService.addWebsitePosition(websitePosition);
    }

    @GetMapping("/websites")
    public List<WebsiteDto> getAllWebsites() {
        return websiteService.getAllWebsites();
    }

    @GetMapping("/websites/{websiteId}/usage")
    public WebsiteUsageDto getWebsiteUsage(@PathVariable Long websiteId, @RequestParam String usageDate) {
        return websiteService.getWebsiteUsage(websiteId, LocalDateTime.parse(usageDate));
    }

    @GetMapping("/websites/{websiteId}")
    public WebsiteDto getWebsiteById(@PathVariable Long websiteId) {
        return websiteService.getWebsiteById(websiteId);
    }

    // Campaign related endpoints
    @PostMapping("/campaign")
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        return campaignService.addCampaign(campaign);
    }

    @GetMapping("/campaigns/all")
    public List<CampaignDto> getAllCampaigns() {
        return campaignService.getAllCampaigns();
    }

    @GetMapping("/campaigns/companies/{company-id}")
    public List<CampaignDto> getCampaignsByCompany(@PathVariable Long companyId) {
        return campaignService.getCompanyCampaigns(companyId);
    }

    @GetMapping("/campaigns/active")
    public List<CampaignDto> getAllActiveCampaigns() {
        return campaignService.getActiveCampaigns();
    }

    @GetMapping("/campaigns/{campaign-id}/")
    public CampaignDto getCampaignById(@PathVariable Long campaignId) {
        return campaignService.getCampaignById(campaignId);
    }

    @GetMapping("/campaigns/websites/{websiteId}")
    public List<CampaignDto> getCampaignsByWebsiteId(@PathVariable Long websiteId) {
        return campaignService.getWebsiteCampaigns(websiteId);
    }
// Campaign banner position related endpoints

    @PostMapping("/campaign-banner-position/add")
    public CampaignBannerPosition addCampaignBannerPosition(@RequestBody CampaignBannerPosition campaignBannerPosition) {
        return campaignBannerPositionService.addCampaignBannerPosition(campaignBannerPosition);
    }

    @GetMapping("/campaign-banner-positions/campaigns/{campaignId}")
    public List<CampaignBannerPositionDto> getCampaignBannerPositions(@PathVariable Long campaignId) {
        return campaignBannerPositionService.getCampaignBannerPositionsByCampaignId(campaignId);
    }

}

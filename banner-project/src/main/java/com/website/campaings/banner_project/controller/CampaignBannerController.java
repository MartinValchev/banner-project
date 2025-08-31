package com.website.campaings.banner_project.controller;

import com.website.campaings.banner_project.entity.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("campaign")
public class CampaignBannerController {

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
    public Company getCompany(@RequestParam("id") Long id) {
        //TODO: implement
        return null;
    }

// Website related endpoints
    @PostMapping("/website")
    public Website addWebsite(@RequestBody Website website) {
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

    @GetMapping("/websites/{id}/usage")
    public List<Website> getWebsiteUsage(@RequestParam("website_id") Long websiteId) {
        //TODO: implement
        return null;
    }

    @GetMapping("/websites/{id}")
    public List<Website> getWebsiteById(@RequestParam("id") Long websiteId) {
        //TODO: implement
        return null;
    }
// Campaign related endpoints
    @PostMapping("/campaign")
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        //TODO: implement
        return null;
    }

    @PostMapping("/campaign-banner-position")
    public CampaignBannerPosition addCampaignBannerPosition(@RequestBody CampaignBannerPosition campaignBannerPosition) {
        //TODO: implement
        return null;
    }

    @GetMapping("/campaigns")
    public List<Campaign> getAllCampaigns() {
        //TODO: implement
        return null;
    }

    @GetMapping("/campaigns/companies/{company-id}")
    public List<Campaign> getCampaignsByCompany(@RequestParam("company-id") Long companyId) {
        //TODO: implement
        return null;
    }

    @GetMapping("/campaigns/active")
    public List<Campaign> getAllActiveCampaigns() {
        //TODO: implement
        return null;
    }

    @GetMapping("/campaigns/{campaign-id}/")
    public List<CampaignBannerPosition> getCampaignById(@RequestParam("campaign-id") Long campaignId) {
        //TODO: implement
        return null;
    }

}

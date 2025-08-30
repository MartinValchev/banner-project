package com.website.campaings.banner_project.controller;

import com.website.campaings.banner_project.entity.Banner;
import com.website.campaings.banner_project.entity.Campaign;
import com.website.campaings.banner_project.entity.CampaignBannerPosition;
import com.website.campaings.banner_project.entity.Website;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampaignBannerController {

    @GetMapping("/all-banners")
    public List<Banner> getAllBanners() {
        //TODO: implement
        return null;
    }

    @PostMapping("/addBanner")
    public Banner addBanner(@RequestBody() Banner banner) {
        //TODO: implement
        return null;
    }

// Website related endpoints

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

    @GetMapping("/websites/website-id}")
    public List<Website> getWebsiteById(@RequestParam("website-id") Long websiteId) {
        //TODO: implement
        return null;
    }
// Campaign related endpoints
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

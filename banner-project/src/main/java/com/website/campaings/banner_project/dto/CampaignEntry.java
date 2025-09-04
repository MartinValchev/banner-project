package com.website.campaings.banner_project.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CampaignEntry {
    private Long bannerId;
    private String bannerName;
    private Long websiteId;
    private String websiteName;
    private Long websitePositionId;
    private String websitePositionName;
    private Long impressions;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}

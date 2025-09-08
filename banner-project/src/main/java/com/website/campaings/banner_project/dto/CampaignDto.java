package com.website.campaings.banner_project.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CampaignDto {
    private Long campaignId;
    private String campaignName;
    private List<CampaignBannerPositionDto> entryList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}

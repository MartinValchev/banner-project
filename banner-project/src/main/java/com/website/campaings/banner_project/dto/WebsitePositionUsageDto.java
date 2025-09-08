package com.website.campaings.banner_project.dto;

import lombok.Data;

@Data
public class WebsitePositionUsageDto {
    private Long websitePositionId;
    private String positionName;


    private Long currentImpressions;
    private Long expectedPositionImpressions;


    public Float getUsagePercent() {
        return ((float) currentImpressions / expectedPositionImpressions) * 100;
    }
}

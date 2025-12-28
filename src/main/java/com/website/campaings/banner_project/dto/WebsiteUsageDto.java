package com.website.campaings.banner_project.dto;

import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
public class WebsiteUsageDto {
    private Long websiteId;
    private String websiteDomain;
    private List<WebsitePositionUsageDto> usages;
    private Float overallUsagePercent;
    private LocalDateTime usageDate;



    public LocalDateTime getUsageDate() {
        return Objects.isNull(this.usageDate) ? LocalDateTime.now() : usageDate;
    }

    private Float getOverallUsage() {
        return CollectionUtils.isEmpty(usages) ? 0.00f : usages.stream()
                .map(WebsitePositionUsageDto::getUsagePercent).reduce((Float::sum)).orElse(0.00f);
    }
}

package com.website.campaings.banner_project.dto;

import lombok.Data;

import java.util.List;

@Data
public class WebsiteDto {
    private Long id;
    private Long websiteId;
    private String websiteDomain;
    private String description;
    private List<WebsiteEntry> entryList;
}

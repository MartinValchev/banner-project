package com.website.campaings.banner_project.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BannerDto {
    private Long bannerId;
    private String name;
    private String size;
}

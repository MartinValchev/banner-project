package com.website.campaings.banner_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "website_position")
@Getter
@Setter
public class WebsitePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Long websitePositionId;

    private String positionName;

    private Long expectedImpressions;

    @ManyToOne
    @JoinColumn(name = "website_id", nullable = false)
    private Website website;
}

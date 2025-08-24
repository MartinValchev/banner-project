package com.website.campaings.banner_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="campaign-banner-position")
@Getter
@Setter
public class CampaignBannerPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private long impressions;

    @ManyToOne
    @JoinColumn(name = "campaign_id", nullable = false)
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name = "banner_id", nullable = false)
    private Banner banner;

    @ManyToOne
    @JoinColumn(name="website", nullable = false)
    private Website website;
}

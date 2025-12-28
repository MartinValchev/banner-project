package com.website.campaings.banner_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="campaign")
@Getter
@Setter
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Long campaignId;

    private String campaignName;

    @OneToMany(mappedBy = "campaign")
    private List<CampaignBannerPosition> campaignBannerPositions;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
}

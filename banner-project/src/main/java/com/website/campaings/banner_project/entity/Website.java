package com.website.campaings.banner_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name="website")
public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String websiteDomain;
    private Long websiteId;

    @OneToMany(mappedBy = "website")
    private List<WebsitePosition> websitePositions;
    private String description;
}

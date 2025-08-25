package com.website.campaings.banner_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "company")
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name="company_name")
    private String name;
    private String notes;

    @OneToMany(mappedBy = "company")
    private List<Campaign> campaigns;
}

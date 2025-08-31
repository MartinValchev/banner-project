package com.website.campaings.banner_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "banner")
@Getter
@Setter
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long bannerId;

    @Column(name = "banner_name")
    private String name;

    @Column(name= "banner_size")
    private String size;
}

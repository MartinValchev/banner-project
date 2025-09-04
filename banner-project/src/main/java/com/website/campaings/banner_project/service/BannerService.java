package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.entity.Banner;
import com.website.campaings.banner_project.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BannerService {
    @Autowired
    private BannerRepository bannerRepository;

    public Banner saveBanner(Banner banner) {
        banner.setId(UUID.randomUUID());
        return bannerRepository.save(banner);
    }

    public List<Banner> getAllBanners() {
        List<Banner> banners = new ArrayList<>();
        bannerRepository.findAll().forEach(banners::add);
        return banners;
    }
}

package com.website.campaings.banner_project.service;

import com.website.campaings.banner_project.dto.BannerDto;
import com.website.campaings.banner_project.entity.Banner;
import com.website.campaings.banner_project.repository.BannerRepository;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.stream.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
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

    public List<BannerDto> getAllBanners() {
        Iterable<Banner> allBanners = bannerRepository.findAll();
        if (CollectionUtils.isEmpty((Collection<?>) allBanners)) {
            return new ArrayList<>();
        }
        return Streams.of(allBanners).map(this::toBannerDto).toList();
    }

    private BannerDto toBannerDto(Banner banner) {
        BannerDto dto = new BannerDto();
        dto.setBannerId(banner.getBannerId());
        dto.setSize(banner.getSize());
        dto.setName(banner.getName());
        return dto;
    }
}

package com.webapp.nguyenminh.service;

import java.util.List;
import java.util.Optional;

import com.webapp.nguyenminh.entity.ImageEntity;
import com.webapp.nguyenminh.entity.InformationCtyDataEntity;

public interface InformationCtyService {
	List<InformationCtyDataEntity> loadAllInformation();
	Optional<ImageEntity> findImageById(String id);
}

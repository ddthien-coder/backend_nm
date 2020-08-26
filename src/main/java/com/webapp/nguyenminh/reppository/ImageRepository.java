package com.webapp.nguyenminh.reppository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.nguyenminh.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, String> {
	Optional<ImageEntity> findById(String id);
}

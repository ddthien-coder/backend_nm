package com.webapp.nguyenminh.reppository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.nguyenminh.entity.InformationCtyDataEntity;

@Repository
public interface InformationCtyRepository extends JpaRepository<InformationCtyDataEntity, String> {

}

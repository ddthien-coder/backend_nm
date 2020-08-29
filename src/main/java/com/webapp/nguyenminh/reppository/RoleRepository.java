package com.webapp.nguyenminh.reppository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.nguyenminh.entity.RoleEntity;
import com.webapp.nguyenminh.enums.ERole;


@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	
	/**
	 * 
	 * @param name
	 * @return
	 * @author DUCTHIEN
	 */
	
	Optional<RoleEntity> findByName(ERole name);
}

package com.webapp.nguyenminh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.nguyenminh.entity.MenuEntity;
import com.webapp.nguyenminh.reppository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menurepository;
	@Override
	public List<MenuEntity> getListMenu() {
		// TODO Auto-generated method stub
		return menurepository.findAll();
	}

}

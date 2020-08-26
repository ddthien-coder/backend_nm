package com.webapp.nguyenminh.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.nguyenminh.entity.ImageEntity;
import com.webapp.nguyenminh.entity.InformationCtyDataEntity;
import com.webapp.nguyenminh.entity.MenuEntity;
import com.webapp.nguyenminh.service.InformationCtyService;
import com.webapp.nguyenminh.service.MenuService;


@CrossOrigin(origins = "*", maxAge = 3600)
@Service
@RestController
@RequestMapping("/api/v1/home")
public class HomeController {
	public static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	InformationCtyService inforservice;
	@Autowired
	MenuService menuservice;
	
	
	//------------------------------------------Load information----------------------------------------//
	@GetMapping(value = "/information")
	public ResponseEntity<?> loadAllInformation(){
		logger.info("load informationcty");
		List<InformationCtyDataEntity> listinfor = inforservice.loadAllInformation();
		return new ResponseEntity<List<InformationCtyDataEntity>>(listinfor,HttpStatus.OK);
	}
	//------------------------------------------Load menu----------------------------------------//
	@GetMapping(value = "/menu")
	public ResponseEntity<?> loadAllMenu(){
		logger.info("load menuhome");
		List<MenuEntity> listmenu = menuservice.getListMenu();
		return new ResponseEntity<List<MenuEntity>>(listmenu, HttpStatus.OK);
	}
	//------------------------------------------Load image----------------------------------------//
	@GetMapping(value = "/viewJPG/{fileId}", produces = MediaType.IMAGE_JPEG_VALUE)
	public void getJPGImage(HttpServletResponse response, @PathVariable String fileId) throws IOException {
		
		logger.info("get JPG Image");
		ImageEntity img = inforservice.findImageById(fileId).get();
		InputStream inputStream =  new ByteArrayInputStream(img.getData());
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(inputStream, response.getOutputStream());
	}
	@GetMapping(value = "/viewJPEG/{fileId}", produces = MediaType.IMAGE_JPEG_VALUE)
	public void getJPEGImage(HttpServletResponse response, @PathVariable String fileId) throws IOException {
		
		logger.info("get JPG Image");
		ImageEntity img = inforservice.findImageById(fileId).get();
		InputStream inputStream =  new ByteArrayInputStream(img.getData());
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(inputStream, response.getOutputStream());
	}
	@GetMapping(value = "/viewPNG/{fileId}", produces = MediaType.IMAGE_JPEG_VALUE)
	public void getPNGImage(HttpServletResponse response, @PathVariable String fileId) throws IOException {
		
		logger.info("get JPG Image");
		ImageEntity img = inforservice.findImageById(fileId).get();
		InputStream inputStream =  new ByteArrayInputStream(img.getData());
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(inputStream, response.getOutputStream());
	}
	@GetMapping(value = "/viewGIF/{fileId}}", produces = MediaType.IMAGE_JPEG_VALUE)
	public void getGIFImage(HttpServletResponse response, @PathVariable String fileId) throws IOException {
		
		logger.info("get JPG Image");
		ImageEntity img = inforservice.findImageById(fileId).get();
		InputStream inputStream =  new ByteArrayInputStream(img.getData());
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(inputStream, response.getOutputStream());
	}
	
}

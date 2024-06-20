package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.SC;
import com.khmall.service.SCService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SCController {
	
	@Autowired
	private SCService scService;
	
	// index는 기본 주소가 / 임 특별히 특정한 기능을 넣지 않으면
	// /(기본 주소) 가 index를 바라보기 때문에 작성을 생략해도 되지만
	// 특정한 값을 가져오거나 /(기본 주소)가 index 이외에 다른 html 파일을 바라 볼 때는
	// GetMapping("/") 에 기능이나 html 파일을 작성해줌
	@GetMapping("/") 
	public String getAllSC(Model model) {
		List<SC> sc = scService.getAllSC();
		log.info("모든 db값 가져오는지 확인하기 " + sc);
		/*
		 모든 db값 가져오는지 확인하기 [com.khmall.dto.SC@7c316eb4, com.khmall.dto.SC@6451a3a4, com.khmall.dto.SC@5a531f57, com.khmall.dto.SC@2fdc3425] 
		 
		 DTO에서 @ToString을 이용하지 않으면 DB에서 가져오는 주소값만 보여지기 때문에
		 값을 제대로 가지고 왔는지 확인하길 원한다면 DTO에 @ToString 추가
		 
		 만약에 값을 제대로 가져오지 못하면 null 이 뜰 것
		 * 
		 * 
		 * */
		model.addAttribute("snackAndCompany",sc);
		return "index";
	}
}











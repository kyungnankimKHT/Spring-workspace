package com.khmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khmall.dto.SC;
import com.khmall.service.SCService;

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
		model.addAttribute("snackAndCompany",sc);
		return "index";
	}
}











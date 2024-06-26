package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.khmall.service.EmailService;

@Controller
public class MailController {
	@Autowired
	private EmailService mailService;
	
	@GetMapping("/")
	public String MailPage() {
		return "index";
	}
	
	// 메일에서 인증번호를 전송받은 값이 일치하는지 확인
	@PostMapping("/mail")
	public String mailSend(String mail) {
		int number = mailService.sendMail(mail);
		String num = "" + number; 
		//랜덤으로 생성된 숫자들 가져오기 
		//내가 전달받은 숫자가 맞는지 확인용으로 가져오는 것
		return num;
	}
}








package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

//Bean : 스프링이 알아서 만들고 관리한다는 것

@Controller // 응답 / 요청 제어 역할 명시 +Bean 등록
@RequestMapping("param") //여기 밑에 작성하는 모든 주소앞에 param이 기본으로 붙음
public class ParameterController {
	
	//GETMAPPING main
	
	@GetMapping("main") // param/main 주소로 GET 방식 요청 만듬
	public String paramMain() {
		return "param/param-main";
		// return 할 때 폴더명/파일명 작성
		// param-main.html 템플릿 밑에 파람이라는 폴더 밑에 존재
		// html 파일을 바라볼 때 기본으로 templates 이라는 폴더를 바라보고
		// templates/param/param-main.html 파일을 바라본다는 표시를 작성
	}
	
	@PostMapping("test1") //param/test1 POST 방식 요청
	public String paramTest1(HttpServletRequest req) {
		String inputName = req.getParameter("inputName"); 
		//form 밑에 input 에서 name으로 inputName 존재하는 값 가져오기
		//<input type="text" name="inputName">
		
		String inputAddress = req.getParameter("inputAddress");
		//form 밑에 input 에서 name으로 inputAddress 존재하는 값 가져오기
		//<input type="text" name="inputAddress">
		
		//-> 기본으로 가져오는 값이 String 이기 때문에 숫자값인 Int로 변환
		int inputAge = Integer.parseInt(req.getParameter("inputAge"));
		//form 밑에 input 에서 name으로 inputAge 존재하는 값 가져오기
		//<input type="number" name="inputAge">
		
		
		
		/*
		 * spring에서 Redirect(재요청) 하는 방법
		 * Controller 메서드 반환 값에
		 * redirect:요청주소 작성
		 * 되돌아가짐
		 * */
		
		return "redirect:/param/main";
	}
}









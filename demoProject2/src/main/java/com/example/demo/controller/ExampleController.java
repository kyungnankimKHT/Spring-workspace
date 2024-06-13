package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.StudentDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller // 요청하거나 응답제어 역할을 명시 Bean 등록 Bean = Spring에서 어떤 기능을 하라 설정해놓은 값
@RequestMapping("example") // /example로 시작하는 주소를 해당 컨트롤러에 넣어줌
@Slf4j //lombok 라이브러리가 제공하는 로그 객체 자동생성 어노테이션
public class ExampleController {
		/*
		 * Model
		 * - Spring 에서 데이터 전달 역할을 하는 객체
		 * - org.springframework.ui 패키지
		 * - @SessionAttributes와 함께 사용할 경우 session scope 반환
		 * [기본 사용법]
		 * Model.addAttribute("key"               , value);
		 * Model.addAttribute("html에 전달가능한 이름", 전달할 값을 작성);
		 * */
		@GetMapping("ex1") //  /example/ex1 주소로 보여지는 값
		public String ex1(HttpServletRequest req, Model model) {
			
			// 나중에 DB에서 가져온 값을 보여줄 때 사용하는 메서드
			req.setAttribute("test1", "HttpServletRequest로 전달한 값");
			model.addAttribute("test2","Model로 전달한 값");
			
			// 단일 값(숫자, 문자열) Model을 이용해서 html 전달
			model.addAttribute("productName", "종이컵");
			
			//price로 2000원을 전달
			model.addAttribute("price",2000);
			model.addAttribute("productCompany", "KHCOMPANY");
			
			// 복수 값(배열, List) Model을 이용해서 html 전달
			List<String> fruitList = new ArrayList<>();
			fruitList.add("사과");
			fruitList.add("딸기");
			fruitList.add("바나나");
			
			model.addAttribute("fruitList", fruitList);
			
			List<String> animal = new ArrayList<>();
			animal.add("호랑이");
			animal.add("토끼");
			animal.add("거북이");
			
			model.addAttribute("animal", animal);
			
			
			// DTO 객체 Model을 이용해서 html 전달
			StudentDTO std = new StudentDTO();
			std.setStudentNo("12345");
			std.setName("홍길동");
			std.setAge(30);
			
			model.addAttribute("std", std);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			return "example/ex1"; // templates/example/ex1.html 파일 바라보는 것
		}
}








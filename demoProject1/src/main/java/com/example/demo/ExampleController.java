package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
	@GetMapping("example") //   /example Get 방식 요청 매핑
	public String exampleMethod() {
		return "example";
	}
}

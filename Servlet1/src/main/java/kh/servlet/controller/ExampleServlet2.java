package kh.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ExampleServlet2 extends HttpServlet {
	
	//Get 방식 요청을 (method="get"인 form 태그 제출) 처리하는 메서드
	@Override // HttpServlet 에서 가져와서 개발자에 맞게 다시 작성해주는 것이기 때문에 재사용 Override 작성
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 매개변수 req, resp
		 
		 HttpServletRequest
		  - 클라이언트 요청 시 자동으로 생성되는 객체
		  
		  - 요청시 전달된 데이터, 요청한 클라이언트 정보, 요청을 유연하게 처리하기 위한 객체 등을 제공
		 
		 HttpServletResponse
		 
		  - 클라이언트 요청 시 자동으로 생성되는 객체
		  
		  - 서버가 클라이언트에게 응답할 수 있는 방법 제공
		  (서버 -> 클라이언트 출력 스트림(PrintWriter)
		  
		  -- index.html 만들어서 제출된 이름과 나이 얻어오기
		  --> 제출된 이름, 나이 = 전달 매개변수(Parameter) == 전달된 값 보여줄 것
		  
		  --> 요청에 담긴 특정 파라미터 가져오기 name
		  ---> String HttpServletRequest.getParameter("name속성값");
		  
		  
		 
		 
		 
		 
		 
		 * */
	}

}

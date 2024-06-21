package com.khmall.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Pig;
import com.khmall.mapper.PigMapper;

@Service
public class PigService {
	
	@Autowired
	private PigMapper pigMapper;
	
	public List<Pig> getAllPigs(){
		return pigMapper.getAllPigs();
	}
	
	//getPigById
	public Pig getPigById(int pig_id){
		return pigMapper.getPigById(pig_id);
	}
	
	//uploadPig
	public void uploadPig(String pig_name, int pig_age, MultipartFile file) {
		//파일 이름 가져온다음 
		String fileName = file.getOriginalFilename();
		System.out.println("file Name : " + fileName);
		
		// 나중에 이미지 파일을 저장하는 폴더가 존재하지 않을 경우 생성하는 코드
		// 우리가 저장하고자 하는 파일 경로 설정
		String uploadDir = "C:/Users/user1/Desktop/pig_img/";
		File imgFile = new File(uploadDir + fileName);
		try {
			file.transferTo(imgFile);//이미지를 폴더에 저장하는 코드  /****** 추가 *******/
			//업로드 한 다음에 저장된 이미지 경로와 함께 돼지 정보를 저장하는 서비스를 작성
			Pig pig = new Pig();
			pig.setPig_name(pig_name);
			pig.setPig_age(pig_age);
			//pig.setPig_image_path(uploadDir); //파일 이름만 저장
			//만약에 파일경로와 이름을 같이 저장하길 원한다면 아래 코드를 사용
			pig.setPig_image_path("/images/"+fileName);  //-> data에 /images/파일명.jpg
			 /******       uploadDir ->    fileName    변경해서    추가 *******/
			pigMapper.uploadPig(pig);
			System.out.println("파일 업로드 Service를 성공적으로 완료 했습니다.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
	
}







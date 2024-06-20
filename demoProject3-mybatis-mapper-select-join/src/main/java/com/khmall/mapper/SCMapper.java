package com.khmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.SC;

@Mapper
public interface SCMapper {
	//getAllSC 로 가져온 select join문을 보여주기
	List<SC> getAllSC();
}

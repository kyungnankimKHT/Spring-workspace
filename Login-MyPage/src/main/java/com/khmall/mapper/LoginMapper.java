package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/* @MapperScan 
 * mapper위치가 아예 찾아지지 않을 때 
 * main메서드에 Mapper주소를 작성해주는 어노테이션
 * 사용법
 * @MapperScan("com.khmall.mapper.LoginMapper") 매퍼 하나의매퍼 가져오기
 * @MapperScans("com.khmall.mapper.*") 매퍼 여러종류 가져오기
*/
import com.khmall.dto.Member;
@Mapper
public interface LoginMapper {
	Member getLogin(@Param("member_name") String member_name,
					@Param("member_phone") String member_phone);
}






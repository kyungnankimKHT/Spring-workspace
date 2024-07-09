package com.kh.test.mapper;

import org.apache.ibatis.annotations.Mapper;
/*
MapperScan은 여기서 사용하는 것이 아니라 
com.kh.test 안에 있는 @SpringBootApplication 위 아래 상관없이 
@MapperScan(com.kh.test.mapper) 넣어줌
 */
@Mapper 
public interface GoodsItemMapper { 
	Integer existsByName(String itemName);

}

package com.shop.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.myapp.dto.MemberDTO;

@Mapper
@Repository
public interface MemberMapper {
	List<MemberDTO> memberList();
	void joinUser(MemberDTO memberDto);


}

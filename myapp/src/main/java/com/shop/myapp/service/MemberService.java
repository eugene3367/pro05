package com.shop.myapp.service;

import java.util.List;

import com.shop.myapp.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public void joinUser(MemberDTO memberDto) throws Exception;;


}

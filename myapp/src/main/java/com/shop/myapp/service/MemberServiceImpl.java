package com.shop.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.myapp.dao.MemberMapper;
import com.shop.myapp.dto.MemberDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService{
	private final MemberMapper memberMapper;
	
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberMapper.memberList();
	}

	@Override
	public void joinUser(MemberDTO memberDto) throws Exception {
		memberMapper.joinUser(memberDto);
	}

}

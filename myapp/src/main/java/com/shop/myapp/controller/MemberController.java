package com.shop.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.myapp.dto.MemberDTO;
import com.shop.myapp.service.MemberService;



@Controller
@RequestMapping(value = "/member/")
public class MemberController {
	
	@Autowired
	MemberService memberService;

    // 메인 페이지
    @GetMapping("/index")
    public String index() {
        return "/index";
    }

    // 회원가입 페이지
    @GetMapping("signup")
    public String dispSignup() {
        return "member/signup";
    }

    // 회원가입 처리
    @PostMapping("signup")
    public String execSignup(MemberDTO memberDto) throws Exception {
        memberService.joinUser(memberDto);

        return "redirect:/member/login";
    }

    // 로그인 페이지
    @GetMapping("login")
    public String dispLogin() {
        return "member/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/user/login/result")
    public String dispLoginResult() {
        return "/loginSuccess";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/user/logout/result")
    public String dispLogout() {
        return "/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/user/denied")
    public String dispDenied() {
        return "/denied";
    }

    // 내 정보 페이지
    @GetMapping("/user/info")
    public String dispMyInfo() {
        return "/myinfo";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String dispAdmin() {
        return "/admin";
    }
}

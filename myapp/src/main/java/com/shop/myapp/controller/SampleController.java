package com.shop.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.myapp.dto.ResponseDTO;
import com.shop.myapp.dto.SampleDTO;
import com.shop.myapp.service.SampleService;

@Controller
@RequestMapping(value="/sample/")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("test1")
	@ResponseBody
	public String test1() {
		return "Hello Spring Boot Test1";
	}
	
	@GetMapping("sample")
	@ResponseBody
	public List<SampleDTO> getSample() {
		return sampleService.getSample();
	}
	
    //JSON의 ResultCode를 붙여서 보내는 경우
    @ResponseBody
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("S0001");
        responseDTO.setRes(sampleService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
    @ResponseBody
    @GetMapping("test2")
    public List<SampleDTO> sampleTest() {
        return sampleService.findAll();
    }	
	
	
	@GetMapping("test3")
	public String getThy1(Model model) {
		model.addAttribute("thy1", "타임리프사용하기1");
		return "test3";
	}
	
	@GetMapping("test4")
	public String getThy2(Model model) {
		SampleDTO sample = new SampleDTO("dbwls", "2518");
		model.addAttribute("sample",sample);
		return "test4";
	}
	
	@GetMapping("test5")
	public String getThy3(Model model) {
		return "test5";
	}
	
	@GetMapping("test6")
	public String getThy4(Model model) {
		List<SampleDTO> sampleList = sampleService.getSample();
		model.addAttribute("sampleList", sampleList);
		return "test6";
	}
	
	@GetMapping("test7")
	public String getThy5(Model model) {
		List<SampleDTO> sampleList = sampleService.getSample();
		model.addAttribute("sampleList", sampleList);
		return "test7";
	}
	
	@GetMapping("test8")
	public String getThy6(Model model){
		SampleDTO sample = new SampleDTO("dbwls","2518");
		List<String> genderList = new ArrayList<String>();
		genderList.add("M");
		genderList.add("F");
		model.addAttribute("gender", "F");
		model.addAttribute("genderList", genderList);
		model.addAttribute("sample", sample);
		return "test8";
		
	}
	
	@GetMapping("test9")
	public String getThy7(Model model) {
		return "test9";
	}
	
	@GetMapping("test10")
	public String getThy8(Model model) {
		return "test10";
	}
	

}

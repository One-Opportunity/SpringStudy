package com.biz.mvc02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("hello.do")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("welcome.do")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		
		// welcome.jsp 파일을 views 파일로 열기
		mv.setViewName("welcome");
		
		// message라는 객체에 "홍길동님" 문자열을 실어 보내라
		mv.addObject("message", "홍길동님");
		return mv;
	}
}

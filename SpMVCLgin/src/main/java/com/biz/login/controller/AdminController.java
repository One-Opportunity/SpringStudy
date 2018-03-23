package com.biz.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("admin.good")
	public String hello() {
		
		log.debug("admin.good input");
		return "admin";
	}
	
	@RequestMapping("adminfail.good")
	public String adminfail() {
		return "adminfail"; //adminfail.jsp 열기
	}
	
	
}

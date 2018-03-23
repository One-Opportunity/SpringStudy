package com.biz.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
//	Logger log = LoggerFactory.getLogger(MyController.class);
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	org.apache.log4j.Logger log2 = org.apache.log4j.Logger.getLogger(this.getClass());
	@RequestMapping("hello.wonoh")
	public String hello() {
		log.info("여기는 hello 메서드 시작입니다.");
		log.trace("이건 뭐냐");
		log2.trace("얘도 있네");
		/**
		 * Level 순서
		 * 		error()
		 * 		warn()
		 * 		info()
		 * 		debug()
		 * 		trace()
		 * 		log()
		 * 
		 */
		
		// service1
		log.debug("여기는 service1에서 나오는 값");
		
		
		// service2
		log.debug("여기는 service2에서 나오는 값");
		
		
		// sevice3
		log.error("여기는 service3에서 나오는 값");
		return "hello";
	}
}

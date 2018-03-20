package com.biz.mvc03.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biz.mvc03.service.CalcService;
import com.biz.mvc03.service.MyService;

@Controller
public class MyController {

	MyService myService = new MyService();
	CalcService calcService = new CalcService();
	@RequestMapping("hello.ok")
	public String hello() {

		return "hello";
	}

	@RequestMapping("welcome.ok")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("sum.ok")
	public ModelAndView sum() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sum");
		int sum = myService.sum();
		mv.addObject("sum", sum);
		return mv;
	}
	
	@RequestMapping("calc.ok")
	public ModelAndView calc(HttpServletRequest req) {
		String strNum1 = req.getParameter("num1");
		String strNum2 = req.getParameter("num2");
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		int sum = intNum1 + intNum2;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("calc");
		mv.addObject("sum", sum);
		return mv;
	}
	
	@RequestMapping("calcsum.ok")
	public ModelAndView calcsum(HttpServletRequest req) {
		String strNum1 = req.getParameter("num1");
		String strNum2 = req.getParameter("num2");
		int intNum1 = Integer.parseInt(strNum1);
		int intNum2 = Integer.parseInt(strNum2);
		
		int sum = calcService.calc(intNum1, intNum2);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("calc");
		mv.addObject("num1", intNum1);
		mv.addObject("num2", intNum2);
		mv.addObject("sum", sum);
		return mv;
	}
}

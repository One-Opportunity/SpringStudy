package com.biz.login.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("login.good")
	public String login() {
		return "login/loginform";
	}

	// form으로 전송된 값을 추출하기 위해 Htt[ServletRequest 매개변수 받는다.
	@RequestMapping("loginok.good")
	public String loginok(HttpServletRequest req) {
		log.debug("Login Process 시작");

		// userId = form의 input으로 설정한 name
		String userId = req.getParameter("userId");
		String pwd = req.getParameter("pwd");

		log.debug(userId);
		log.debug(pwd);
		// equalsIgnoreCase = 대소문자 구분없이 검사
		if (userId.equalsIgnoreCase("sincle582") && pwd.equals("1234")) {
			Map<String, Object> sessionObj = new HashMap<String, Object>();
			sessionObj.put("userId", userId);
			sessionObj.put("pwd", pwd);
			sessionObj.put("auth", "admin");
			
			//세션 설정(등록)
			HttpSession reqSession = req.getSession();
			reqSession.setAttribute("admin", sessionObj);
			
			return "redirect:/admin.good";
		} else {
			String msg = "아이디 또는 패스워드가 맞지 않습니다.";
			try {
				msg = URLEncoder.encode(msg,"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "redirect:/login.good?login_message=" + msg;
		}
	}
	
	@RequestMapping("logout.good")
	public String logout(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		session.removeAttribute("admin");
		
		return "redirect:/";
	}
}

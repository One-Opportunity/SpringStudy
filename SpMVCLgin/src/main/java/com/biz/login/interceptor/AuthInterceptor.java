package com.biz.login.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{

	
	/**
	 * dispacher에서 controller로 전송되기 전에 호출되는 method
	 */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		
		Logger log = LoggerFactory.getLogger(this.getClass());
		log.debug("preHandle Start");
		
		// request로부터 (전체)session 추출
		HttpSession session = req.getSession();
		log.debug("전체 session 추출 OK");
		
		//(전체)session에서 admin 객체를 추출
		Object adminSession = session.getAttribute("admin");
		log.debug("admin 객체 추출");

		//session에서 admin 객체가 있는지만 검사
		if(adminSession == null) { // session에 admin이 없구나!!
			log.debug("admin 객체가 없구나!!");
			
			// 요청 경로 재설정
			res.sendRedirect("adminfail.good");
			return false;
		}
		
		return super.preHandle(req, res, handler);
	}
	
}

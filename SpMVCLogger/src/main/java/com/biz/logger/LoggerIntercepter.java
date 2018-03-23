package com.biz.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class LoggerIntercepter extends HandlerInterceptorAdapter{
	
	protected Log log = LogFactory.getLog(this.getClass());
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(log.isDebugEnabled()) {
			log.debug("=============== End ===========================");
		}
		super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		if(log.isDebugEnabled()) {
			log.debug("=============== Start ===========================");
			log.debug("Req URI \t :" + request.getRequestURI());
		}
		return super.preHandle(request, response, handler);
	}


}

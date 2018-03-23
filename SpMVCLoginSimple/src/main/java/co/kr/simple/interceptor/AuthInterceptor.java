package co.kr.simple.interceptor;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import co.kr.simple.user.UserDTO;

public class AuthInterceptor extends HandlerInterceptorAdapter{

	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {

		// session 추출
		HttpSession session = req.getSession();
		
		// session에서 로그인된 객체 추출
		Object loginObj = session.getAttribute("login");
			
		
		// login 객체 없으면
		if(loginObj == null) {
			res.sendRedirect("loginfail.bita");
			return false;
		} else {
			UserDTO dto = (UserDTO) session.getAttribute("login");
			if(dto.getStrAuth().equalsIgnoreCase("admin")) {
				res.sendRedirect("admin.bita");
			} else if (dto.getStrAuth().equalsIgnoreCase("member")) {
				String msg = URLEncoder.encode("관리자만 볼 수 있다", "UTF-8");
				res.sendRedirect("loginfail.bita?msg=" + msg);
			}
		}
		return super.preHandle(req, res, handler);
	}

	
	
}

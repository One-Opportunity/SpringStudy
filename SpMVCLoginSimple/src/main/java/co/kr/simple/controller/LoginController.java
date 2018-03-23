package co.kr.simple.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.simple.user.UserDTO;

@Controller
public class LoginController {

	
	@RequestMapping("loginfail.bita")
	public String loginfail() {
		return "loginfail";
	}
	
	@RequestMapping("login.bita")
	public String login() {
		return "loginform";
	}
	
	@RequestMapping("logout.bita")
	public String logout(HttpServletRequest hsr) {
		HttpSession session = hsr.getSession();
		session.removeAttribute("login");
		return "redirect:/";
	}
	@RequestMapping("adminok.bita")
	public String adminok(HttpServletRequest hsr) {
		String userId = hsr.getParameter("userId");
		String pwd = hsr.getParameter("pwd");
		UserDTO dto = new UserDTO();
		if(userId.equalsIgnoreCase("SiNcLe582") && pwd.equals("1234")) {
			dto.setStrUserId(userId);
			dto.setStrPwd(pwd);
			dto.setStrAuth("admin");
		} else if(userId.equalsIgnoreCase("SINCLe956") && pwd.equals("1234")) {
			dto.setStrUserId(userId);
			dto.setStrPwd(pwd);
			dto.setStrAuth("member");
		} else {
			dto = null;
		}
		HttpSession session = hsr.getSession();
		session.setAttribute("login", dto);
		
		return "redirect:/";
	}
	// form에서 넘겨준 값을 추출해서 login처리를 해야 하므로 HttpServletRequest를 매개변수로 받아야한다.
	@RequestMapping("loginok.bita")
	public String loginok(HttpServletRequest hsr) {
		
		UserDTO dto = new UserDTO();
		String retURL = "redirect:/";
		// form의 input의 name으로 설정한 문자열
		String userId = hsr.getParameter("userId");
		String pwd = hsr.getParameter("pwd");
		
		if(userId.equalsIgnoreCase("SiNcLe582") && pwd.equals("1234")) {
			dto.setStrUserId(userId);
			dto.setStrPwd(pwd);
			dto.setStrAuth("admin");
			retURL += "admin.bita";
		} else if(userId.equalsIgnoreCase("SINCLe956") && pwd.equals("1234")) {
			dto.setStrUserId(userId);
			dto.setStrPwd(pwd);
			dto.setStrAuth("member");
			
			String msg = "관리자만 사용가능";
			try {
				msg = URLEncoder.encode(msg,"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			retURL += "loginfail.bita?msg=" + msg;
			
			
		} else {
			String msg = "로그인 정보가 잘못되었습니다.";
			try {
				msg = URLEncoder.encode(msg,"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			retURL += "loginfail.bita?msg=" + msg;
			
		}
		return retURL;
	}
}

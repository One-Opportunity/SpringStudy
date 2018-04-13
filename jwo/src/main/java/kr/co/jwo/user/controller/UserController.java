package kr.co.jwo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.jwo.user.service.IUserService;

@Controller
public class UserController {
	@Autowired IUserService userService = null;
	
	
	
	public void view() {
		
	}
}

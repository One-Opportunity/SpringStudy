package kr.co.jwo.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value="/index.sc", method=RequestMethod.GET)
	public String index() {
		return "redirect:/login.sc";
		
	}
	// 인덱스로 들어오면 로그인으로 넘김
	@RequestMapping(value="/login.sc", method=RequestMethod.GET)
	public void login() {
		
	}
	
	@RequestMapping(value="/find.sc", method=RequestMethod.GET)
	public void find() {
		
	}

}

package kr.co.starbucks.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {
	
	
	@RequestMapping(value="/main/index.god", method=RequestMethod.GET)
	public void index() {
		
		
	}


}

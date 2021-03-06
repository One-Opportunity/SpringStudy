package kr.co.starbucks.main;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */

@Slf4j
@Controller
public class IndexController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		log.debug("지나갑니다~~~");
		return "redirect:./login.god";
	}
	@RequestMapping(value = "/index.god", method = RequestMethod.GET)
	public String index() {
		log.debug("index도 지나갑니다~~~");	
		return "redirect:./login.god";
	}
	
	@RequestMapping(value = "/login.god", method = RequestMethod.GET)
	public void login() {
		log.debug("로그인화면 도착~~~~");
	}
}

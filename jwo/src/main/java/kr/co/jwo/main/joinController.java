package kr.co.jwo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.jwo.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class joinController {
	
	// 회원가입 페이지로 이동(GET과 POST로 구분)
	@RequestMapping(value="/join.sc", method=RequestMethod.GET)
	public void gojoin() {
	}
	
	// 회원가입
	@ResponseBody
	@RequestMapping(value="/join.sc", method=RequestMethod.POST)
	public String dojoin(UserDTO userDTO) {
		log.debug("userDTO =========>"+userDTO);
		
		return "s";
	}
}

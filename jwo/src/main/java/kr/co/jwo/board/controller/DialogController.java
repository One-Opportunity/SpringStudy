package kr.co.jwo.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.jwo.user.dto.UserDTO;
import kr.co.jwo.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/dialog")
public class DialogController {

	@Autowired private IUserService userService = null;
	
	@RequestMapping(value="/userinfo.god", method=RequestMethod.GET)
	public void userInfo(Model model, Integer userId) {
		UserDTO userDTO = userService.view(userId);
		log.debug("DialogController에 있는 userInfo의 userDTO 정보 : " + userDTO);
		
		model.addAttribute("userDTO", userDTO);
	}
}

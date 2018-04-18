package kr.co.jwo.board.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.jwo.board.dto.BoardDocDTO;
import kr.co.jwo.board.dto.BoardMapDTO;
import kr.co.jwo.board.dto.BoardSearchDTO;
import kr.co.jwo.board.service.IBoardDocService;
import kr.co.jwo.board.service.IBoardMapService;
import kr.co.jwo.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/doc/")
public class BoardDocController {

	@Autowired private IBoardDocService boardDocService = null;
	@Autowired private IBoardMapService mapService = null;
	/**
	 * 게시판 목록
	 */
	@RequestMapping(value="/list.god", method=RequestMethod.GET)
	public void list(Model model, BoardSearchDTO search) {
		log.debug("/board/doc/list.god/의 search확인!!!!" + search);
		List<BoardDocDTO> list = boardDocService.list(search);
		model.addAttribute("list", list);
		model.addAttribute("search", search.getMapId());
		BoardMapDTO boardMapDTO = mapService.view(search.getMapId());
		model.addAttribute("mapDTO", boardMapDTO);
	}
	
	
	@RequestMapping(value="/write.god", method=RequestMethod.GET)
	public void goWrite(Model model, Integer mapId) {
		model.addAttribute("mapId", mapId);
		log.debug("mapId@@@@@@@@@@@@@@@@@@@@@@" + mapId);
	}
	@ResponseBody
	@RequestMapping(value="/write.god", method=RequestMethod.POST)
	public void doWrite(Model model, HttpSession session, BoardDocDTO boardDocDTO) {
		UserDTO userDTO = (UserDTO) session.getAttribute("_user");
		boardDocDTO.setUserId(userDTO.getUserId());
		boardDocService.add(boardDocDTO);
		
		log.debug("====@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=====>>" + userDTO);
		log.debug("====@@@@@@@@@@@@@@  boardDocDTO  @@@@@@@@@@@@@@@@@@@@@@@@ =====>>" + boardDocDTO);
	}
}

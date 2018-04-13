package kr.co.jwo.board.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.jwo.board.dto.BoardDocDTO;
import kr.co.jwo.board.service.IBoardDocService;


@Controller
@RequestMapping("/board/doc/")
public class BoardDocController {

	@Autowired private IBoardDocService boardDocService = null;
	/**
	 * 게시판 목록
	 */
	@RequestMapping(value="/list.god", method=RequestMethod.GET)
	public void list(Model model, Integer mapId) {
		List<BoardDocDTO> list = boardDocService.list(mapId);
		model.addAttribute("list", list);
	}
	
}

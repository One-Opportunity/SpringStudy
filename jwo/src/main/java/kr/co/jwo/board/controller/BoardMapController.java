package kr.co.jwo.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.jwo.board.dto.BoardMapDTO;
import kr.co.jwo.board.service.IBoardMapService;

@Controller
@RequestMapping("/board/map/")
public class BoardMapController {

	@Autowired private IBoardMapService mapService = null;
	
	@ResponseBody
	@RequestMapping(value="/list.god", method=RequestMethod.GET)
	public List<BoardMapDTO> list() {
		return mapService.list();
	}
	
}

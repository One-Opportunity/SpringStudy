package kr.co.cafe.gugudan.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cafe.gugudan.dto.GugudanDTO;
import kr.co.cafe.gugudan.service.IGugudanService;

@Controller
public class GugudanController {
	
	@Autowired private IGugudanService gugudanService = null;
	
	private static final Logger logger = LoggerFactory.getLogger(GugudanController.class);
	@RequestMapping(value="index.nhn", method=RequestMethod.GET)
	public void index() {
		logger.debug(" index >>>>>>>>>>>>> 들어왔어요" );
	}
	
	@RequestMapping(value="gugudan.nhn", method=RequestMethod.POST)
	public void gugudan(Model model, @RequestParam(value="dan") int dan, @RequestParam(value="row") int row) {
		logger.debug(" gugudan >> {}단 {}줄 gugudan!!", dan, row );
		List<GugudanDTO> list = gugudanService.gugudan(dan, row);
		                 
		model.addAttribute("list", list);
		
	}
}

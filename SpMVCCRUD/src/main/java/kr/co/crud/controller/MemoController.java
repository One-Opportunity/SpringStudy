package kr.co.crud.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.crud.data.MemoDAO;
import kr.co.crud.data.MemoDTO;

@Controller
public class MemoController {

	Logger log = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired private SqlSession sqlSession;
	
	@RequestMapping("list.jwo")
	public ModelAndView getList() {
		log.debug("list.jwo");
		log.debug("sqlSession: " + sqlSession);
		
		MemoDAO dao = sqlSession.getMapper(MemoDAO.class);
		log.debug("get Mapper");
		
		List<MemoDTO> memoList = dao.selectAll();
		log.debug("get selectAll");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("memolist", memoList);
		mv.setViewName("memolist");
		return mv;
	}
	
	@RequestMapping("memowrite.jwo")
	public String memoform() {
		return "memoform";
	}
	@RequestMapping("writeok.jwo")
	public String writeok(@ModelAttribute MemoDTO dto) {
		MemoDAO dao = sqlSession.getMapper(MemoDAO.class);
		dao.insertOk(dto.getName(), dto.getMemo());
		return "redirect:list.jwo";
	}
	
	@RequestMapping("delete.jwo")
	public String deleteOk(@RequestParam int id) {
		MemoDAO dao = sqlSession.getMapper(MemoDAO.class);
		dao.deleteOk(id);
		return "redirect:list.jwo";
	}
}

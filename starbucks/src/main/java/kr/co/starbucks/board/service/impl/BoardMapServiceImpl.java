package kr.co.starbucks.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.starbucks.board.dao.IBoardMapDAO;
import kr.co.starbucks.board.dto.BoardMapDTO;
import kr.co.starbucks.board.service.IBoardMapService;

@Service
public class BoardMapServiceImpl implements IBoardMapService{
	
	@Autowired private IBoardMapDAO boardMapDAO = null;
	
	@Override
	public List<BoardMapDTO> list() {
		return boardMapDAO.selectList();
	}

}

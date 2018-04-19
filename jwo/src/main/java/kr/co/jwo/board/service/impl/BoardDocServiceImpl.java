package kr.co.jwo.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jwo.board.dao.IBoardDocDAO;
import kr.co.jwo.board.dto.BoardDocDTO;
import kr.co.jwo.board.dto.BoardSearchDTO;
import kr.co.jwo.board.service.IBoardDocService;

@Service
public class BoardDocServiceImpl implements IBoardDocService{

	@Autowired private IBoardDocDAO documentDAO = null;
	@Override
	public void add(BoardDocDTO documentDTO) {
		documentDAO.insert(documentDTO);
	}

	@Override
	public void edit(BoardDocDTO documentDTO) {
		documentDAO.update(documentDTO);
	}

	@Override
	public void remove(int docId) {
		documentDAO.delete(docId);
	}

	@Override
	public BoardDocDTO view(int docId) {
		return documentDAO.selectOne(docId);
	}

	@Override
	public List<BoardDocDTO> list(BoardSearchDTO boardSearchDTO) {
		// 1. 총 게시물 갯수 count
		boardSearchDTO.setTotal(documentDAO.selectCount(boardSearchDTO));
		
		// 2. 게시물 목록 가져오기
		
		return documentDAO.selectList(boardSearchDTO);
	}
	
}

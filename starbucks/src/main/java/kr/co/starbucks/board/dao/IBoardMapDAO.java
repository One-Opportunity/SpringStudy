package kr.co.starbucks.board.dao;

import java.util.List;

import kr.co.starbucks.board.dto.BoardMapDTO;

public interface IBoardMapDAO {
	public List<BoardMapDTO> selectList();
}

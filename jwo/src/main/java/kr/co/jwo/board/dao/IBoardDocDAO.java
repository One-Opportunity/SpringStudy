package kr.co.jwo.board.dao;

import java.util.List;

import kr.co.jwo.board.dto.BoardDocDTO;

public interface IBoardDocDAO {
	
	public void insert(BoardDocDTO documentDTO);
	public void update(BoardDocDTO documentDTO);
	public void delete(int docId);
	public BoardDocDTO selectOne(int docId);
	public List<BoardDocDTO> selectList(Integer mapId);
}

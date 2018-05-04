package kr.co.jwo.board.dao;

import java.util.List;

import kr.co.jwo.board.dto.BoardCommentDTO;

public interface IBoardCommentDAO {
	public List<BoardCommentDTO>selectList(Integer docId);
	public void insert(BoardCommentDTO commentDTO);
	public void delete(Integer commentId);
	public void deleteByDocId(Integer docId);
}

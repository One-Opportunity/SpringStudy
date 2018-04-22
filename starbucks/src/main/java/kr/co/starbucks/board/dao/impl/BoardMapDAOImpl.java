package kr.co.starbucks.board.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.starbucks.board.dao.IBoardMapDAO;
import kr.co.starbucks.board.dto.BoardMapDTO;
import kr.co.starbucks.common.dao.BaseDaoSupport;

@Repository
public class BoardMapDAOImpl extends BaseDaoSupport implements IBoardMapDAO{

	@Override
	public List<BoardMapDTO> selectList() {
		return this.getSqlSession().selectList("BoardMap.selectList");
	}

}

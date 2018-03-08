package kr.co.abcde.boardMap.dao.impl;

import org.springframework.stereotype.Repository;

import kr.co.abcde.boardMap.dao.IMapDAO;
import kr.co.abcde.boardMap.dto.MapDTO;
import kr.co.abcde.common.dao.BaseDaoSupport;

@Repository
public class MapDAOImpl extends BaseDaoSupport implements IMapDAO {

	@Override
	public void insertData(MapDTO mapDTO) {
		this.getSqlSession().insert("Map.insertData", mapDTO);
	}

	@Override
	public MapDTO selectOne(int mapId) {
		return this.getSqlSession().selectOne("Map.selectOne", mapId);
	}

}

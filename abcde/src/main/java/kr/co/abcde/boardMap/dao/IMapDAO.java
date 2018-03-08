package kr.co.abcde.boardMap.dao;

import kr.co.abcde.boardMap.dto.MapDTO;

public interface IMapDAO {
	public void insertData(MapDTO mapDTO);
	
	public MapDTO selectOne(int mapId);
}

package kr.co.abcde.boardMap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.abcde.boardMap.dao.IMapDAO;
import kr.co.abcde.boardMap.dto.MapDTO;
import kr.co.abcde.boardMap.service.IMapService;

@Service
public class MapServiceImpl implements IMapService{
	
	@Autowired private IMapDAO mapDAO = null;
	
	@Override
	public void write(MapDTO mapDTO) {
		mapDAO.insertData(mapDTO);
	}

	@Override
	public MapDTO view(int mapId) {
		return mapDAO.selectOne(mapId);
	}

}

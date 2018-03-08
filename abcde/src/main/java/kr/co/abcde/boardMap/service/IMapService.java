package kr.co.abcde.boardMap.service;

import kr.co.abcde.boardMap.dto.MapDTO;

public interface IMapService {
	public void write(MapDTO mapDTO);
	
	public MapDTO view(int mapId);
}

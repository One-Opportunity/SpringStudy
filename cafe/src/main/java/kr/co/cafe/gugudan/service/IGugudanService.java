package kr.co.cafe.gugudan.service;

import java.util.List;

import kr.co.cafe.gugudan.dto.GugudanDTO;

public interface IGugudanService {
	public List<GugudanDTO> gugudan(int dan, int row);
}

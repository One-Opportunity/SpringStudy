package kr.co.cafe.gugudan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.cafe.gugudan.dto.GugudanDTO;
import kr.co.cafe.gugudan.service.IGugudanService;

@Service
public class GugudanServiceImpl implements IGugudanService {

	String strNum = null;
	String[] arrStrNum = null;
	@Override
	public List<GugudanDTO> gugudan(int dan, int row) {
		List<GugudanDTO> arr = new ArrayList<GugudanDTO>();
		for (int i = 1; i <= row; i++) {
			GugudanDTO gugudanDTO = new GugudanDTO();
			gugudanDTO.setDan(dan);
			gugudanDTO.setRow(i);
			gugudanDTO.setResult(dan*i);
			strNum = String.valueOf(gugudanDTO.getResult());
			arrStrNum = strNum.split("");
			gugudanDTO.setArrStrNum(arrStrNum);
			arr.add(gugudanDTO);

		}
		return arr;
	}

}

package kr.co.jwo.common.dto;

import lombok.Data;

@Data
public class ResponseDTO {

	// id 체크
	public int code = 9; // 9 : 성공
	public String msg = "정상적으로 성공하였습니다.";
	
	
	// phone 체크	
	public int phoneCode = 9; // 9 : 성공
	public String phoneMsg = "정상적으로 성공하였습니다.";
	
	// email 체크
	public int emailCode = 9; // 9 : 성공
	public String emailMsg = "정상적으로 성공하였습니다.";
}

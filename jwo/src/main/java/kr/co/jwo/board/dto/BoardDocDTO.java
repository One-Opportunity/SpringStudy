package kr.co.jwo.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDocDTO {

	
	private Integer docId = null,			// 게시물ID
					userId = null,			// 사용자ID
					mapId = null,			// 맵ID
					cntRead = null;			// 조회수
	
	private String 	title = null,			// 제목
					boardContents = null;	// 내용
	
	private Date regDt = null;				// 등록일
	
	
	
	
	
	
	
	
	
}

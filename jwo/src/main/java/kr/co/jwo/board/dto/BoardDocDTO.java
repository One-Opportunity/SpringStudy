package kr.co.jwo.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDocDTO {

	
	private Integer docId = null,
					userId = null,
					mapId = null,
					cntRead = null;
	
	private String 	title = null,
					boardContents = null;
	private Date regDt = null;		
}

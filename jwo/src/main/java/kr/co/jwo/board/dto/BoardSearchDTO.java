package kr.co.jwo.board.dto;

import lombok.Data;

@Data
public class BoardSearchDTO {
	private Integer mapId = null;	// 맵ID
	private String 	searchText = null,
					searchType = null;
}
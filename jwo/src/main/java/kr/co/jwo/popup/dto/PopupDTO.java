package kr.co.jwo.popup.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PopupDTO {
//	POP_ID	NUMBER(8,0)
//	POP_TITLE	VARCHAR2(10 BYTE)
//	REG_DT	DATE
//	POPUP_YN	VARCHAR2(1 BYTE)
	
	public Integer popId 	= null;
	
	public String 	popTitle 	= null,
					popupYn		= null;
	
	public Date	regDt	= null;
}

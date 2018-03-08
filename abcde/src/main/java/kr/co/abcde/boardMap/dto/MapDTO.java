package kr.co.abcde.boardMap.dto;

import java.util.Date;

public class MapDTO {
//	MAP_ID	NUMBER(5,0)
//	MAP_NAME	VARCHAR2(30 BYTE)
//	MAP_SORT	NUMBER(5,0)
//	MAP_TYPE	VARCHAR2(1 BYTE)
//	DEL_YN	VARCHAR2(1 BYTE)
//	COMMENT_YN	VARCHAR2(1 BYTE)
//	FILE_YN	VARCHAR2(1 BYTE)
//	REG_DT	DATE
//	PAR_MAP_ID	NUMBER(5,0)


	Integer mapId = null		// 	메뉴ID
		,mapSort = null			// 	순번
		,parMapId = null;		// 	???
	
	String mapName = null		// 	메뉴이름
			,mapType = null		//	메뉴타입
			,delYn = null		//	삭제여부
			,commentYn = null	//	댓글여부
			,fileYn = null;		//	첨부파일여부
	
	Date regDt;					//	등록일

	public Integer getMapId() {
		return mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public Integer getMapSort() {
		return mapSort;
	}

	public void setMapSort(Integer mapSort) {
		this.mapSort = mapSort;
	}

	public Integer getParMapId() {
		return parMapId;
	}

	public void setParMapId(Integer parMapId) {
		this.parMapId = parMapId;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getMapType() {
		return mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getCommentYn() {
		return commentYn;
	}

	public void setCommentYn(String commentYn) {
		this.commentYn = commentYn;
	}

	public String getFileYn() {
		return fileYn;
	}

	public void setFileYn(String fileYn) {
		this.fileYn = fileYn;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	@Override
	public String toString() {
		return "MapDTO [mapId=" + mapId + ", mapSort=" + mapSort + ", parMapId=" + parMapId + ", mapName=" + mapName
				+ ", mapType=" + mapType + ", delYn=" + delYn + ", commentYn=" + commentYn + ", fileYn=" + fileYn
				+ ", regDt=" + regDt + "]";
	}

	
}

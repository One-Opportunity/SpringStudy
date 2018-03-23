package kr.co.cafe.gugudan.dto;

public class GugudanDTO {
	private int dan = 0;
	private int row = 0; 
	private int result = 0;
	private String[] arrStrNum = null;
	
	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "GugudanDTO [dan=" + dan + ", row=" + row + ", result=" + result + "]";
	}

	public String[] getArrStrNum() {
		return arrStrNum;
	}

	public void setArrStrNum(String[] arrStrNum) {
		this.arrStrNum = arrStrNum;
	}
	
}

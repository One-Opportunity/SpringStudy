package kr.co.crud.data;

public class MemoDTO {
	
	private int id;
	private String name,
					memo;
	
	public MemoDTO() {
		super();
	}
	
	public MemoDTO(int id, String name, String memo) {
		super();
		this.id = id;
		this.name = name;
		this.memo = memo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}

package kr.co.sincle.user.dao;

import kr.co.sincle.user.dto.UserDTO;

public interface IUserDAO {
	public void insertData(UserDTO userDTO);
	public void deleteData(int userId);
	public void updateData(UserDTO userDTO);
	
	public UserDTO selectData(int userId);
}

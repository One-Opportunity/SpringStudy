package kr.co.abcde.user.dao;

import kr.co.abcde.user.dto.UserDTO;

public interface IUserDAO {
	public void insertData(UserDTO userDTO);
	public UserDTO selectOne(int userId);
	public UserDTO selectOneByLoginId(String loginId);
	
}

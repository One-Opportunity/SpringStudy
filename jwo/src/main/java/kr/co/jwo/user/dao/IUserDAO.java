package kr.co.jwo.user.dao;

import kr.co.jwo.user.dto.UserDTO;

public interface IUserDAO {

	public void insert(UserDTO userDTO);
	public void update(UserDTO userDTO);
	public UserDTO select(int userId);
	public int selectCountByLoginId(String loginId);
	public void delete(int userId);
	
}

package kr.co.starbucks.user.dao;

import kr.co.starbucks.user.dto.UserDTO;

public interface IUserDAO {

	public void insert(UserDTO userDTO);
	public int selectCountByLoginId(String loginId);
	public int selectCountByEmail(String email);
	public int selectCountByPhone(String phone);
	public UserDTO selectByLoginId(String loginId);
}

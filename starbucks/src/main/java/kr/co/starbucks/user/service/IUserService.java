package kr.co.starbucks.user.service;

import kr.co.starbucks.user.dto.UserDTO;

public interface IUserService {
	
	public void write(UserDTO userDTO);
	public int viewCountByLoginId(String loginId);
	public int viewCountByEmail(String email);
	public int viewCountByPhone(String phone);
}

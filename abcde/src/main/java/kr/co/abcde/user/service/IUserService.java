package kr.co.abcde.user.service;

import kr.co.abcde.user.dto.UserDTO;

public interface IUserService {
	public void write(UserDTO userDTO);
	
	public UserDTO view(int userId);
	public UserDTO viewByLoginId(String loginId);
}

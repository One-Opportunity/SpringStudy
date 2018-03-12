package kr.co.sincle.user.service;

import kr.co.sincle.user.dto.UserDTO;

public interface IUserService {
	public void write(UserDTO userDTO);
	public void remove(int userId);
	public void edit(UserDTO userDTO);
	
	public UserDTO view(int userId);
}

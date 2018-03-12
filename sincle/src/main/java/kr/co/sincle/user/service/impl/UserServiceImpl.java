package kr.co.sincle.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sincle.user.dao.IUserDAO;
import kr.co.sincle.user.dto.UserDTO;
import kr.co.sincle.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired private IUserDAO userDAO = null;
	@Override
	public void write(UserDTO userDTO) {
		userDAO.insertData(userDTO);
	}
	@Override
	public void remove(int userId) {
		userDAO.deleteData(userId);
	}
	@Override
	public void edit(UserDTO userDTO) {
		userDAO.updateData(userDTO);
	}
	@Override
	public UserDTO view(int userId) {
		return userDAO.selectData(userId);
	}

}

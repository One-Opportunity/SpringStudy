package kr.co.abcde.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.abcde.user.dao.IUserDAO;
import kr.co.abcde.user.dto.UserDTO;
import kr.co.abcde.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired private IUserDAO userDAO = null;
	
	@Override
	public void write(UserDTO userDTO) {
		userDAO.insertData(userDTO);
	}

	@Override
	public UserDTO view(int userId) {
		return userDAO.selectOne(userId);
	}

	@Override
	public UserDTO viewByLoginId(String loginId) {
		return userDAO.selectOneByLoginId(loginId);
	}
}

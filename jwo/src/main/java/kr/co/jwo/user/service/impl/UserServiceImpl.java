package kr.co.jwo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jwo.user.dao.IUserDAO;
import kr.co.jwo.user.dto.UserDTO;
import kr.co.jwo.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDAO userDAO = null;

	@Override
	public void write(UserDTO userDTO) {
		userDAO.insert(userDTO);
	}

	@Override
	public void edit(UserDTO userDTO) {
		userDAO.update(userDTO);
	}

	@Override
	public UserDTO view(int userId) {
		return userDAO.select(userId);
	}

	@Override
	public void remove(int userId) {
		userDAO.delete(userId);
	}

	@Override
	public int viewCountByLoginId(String loginId) {
		int cnt = userDAO.selectCountByLoginId(loginId);
		if (cnt == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}

package kr.co.starbucks.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.starbucks.user.dao.IUserDAO;
import kr.co.starbucks.user.dto.UserDTO;
import kr.co.starbucks.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDAO userDAO = null;
	int cnt = 0;

	@Override
	public void write(UserDTO userDTO) {
		userDAO.insert(userDTO);
	}
	@Override
	public int viewCountByLoginId(String loginId) {
		cnt = userDAO.selectCountByLoginId(loginId);
		if (cnt == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int viewCountByEmail(String email) {
		cnt = userDAO.selectCountByEmail(email);
		if (cnt == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int viewCountByPhone(String phone) {
		cnt = userDAO.selectCountByPhone(phone);
		if (cnt == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}

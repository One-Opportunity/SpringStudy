package kr.co.abcde.user.dao.impl;

import org.springframework.stereotype.Repository;

import kr.co.abcde.common.dao.BaseDaoSupport;
import kr.co.abcde.user.dao.IUserDAO;
import kr.co.abcde.user.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDaoSupport implements IUserDAO {

	@Override
	public void insertData(UserDTO userDTO) {
		this.getSqlSession().insert("User.insertData", userDTO);
	}

	@Override
	public UserDTO selectOne(int userId) {
		return this.getSqlSession().selectOne("User.selectOne", userId);
	}

	@Override
	public UserDTO selectOneByLoginId(String loginId) {
		return this.getSqlSession().selectOne("User.selectOneByLoginId", loginId);
	}

}
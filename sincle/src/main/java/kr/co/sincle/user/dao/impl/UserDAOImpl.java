package kr.co.sincle.user.dao.impl;

import org.springframework.stereotype.Repository;

import kr.co.sincle.common.dao.BaseDaoSupport;
import kr.co.sincle.user.dao.IUserDAO;
import kr.co.sincle.user.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDaoSupport implements IUserDAO{

	
	@Override
	public void insertData(UserDTO userDTO) {
		this.getSqlSession().insert("User.insertData", userDTO);
	}

	@Override
	public void deleteData(int userId) {
		this.getSqlSession().delete("User.deleteData", userId);
	}

	@Override
	public void updateData(UserDTO userDTO) {
		this.getSqlSession().update("User.updateData", userDTO);
	}

	@Override
	public UserDTO selectData(int userId) {
		return this.getSqlSession().selectOne("User.selectData", userId);
	}
	
}

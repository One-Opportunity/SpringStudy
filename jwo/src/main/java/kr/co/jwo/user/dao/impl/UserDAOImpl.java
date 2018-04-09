package kr.co.jwo.user.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.junit.experimental.theories.Theories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jwo.common.dao.BaseDaoSupport;
import kr.co.jwo.user.dao.IUserDAO;
import kr.co.jwo.user.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDaoSupport implements IUserDAO{

	
	@Override
	public void insert(UserDTO userDTO) {
		SqlSession session = this.getSqlSession();
		session.insert("user.insertData",userDTO);
	}

	@Override
	public void update(UserDTO userDTO) {
		this.getSqlSession().update("user.updateData", userDTO);
	}

	@Override
	public UserDTO select(int userId) {
		return this.getSqlSession().selectOne("user.selectData", userId);
	}

	@Override
	public void delete(int userId) {
		this.getSqlSession().update("user.deleteData", userId);

	}

	@Override
	public int selectCountByLoginId(String loginId) {
		return this.getSqlSession().selectOne("user.selectCountByLoginId", loginId);
	}

}

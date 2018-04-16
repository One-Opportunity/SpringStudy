package kr.co.starbucks.user.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.starbucks.common.dao.BaseDaoSupport;
import kr.co.starbucks.user.dao.IUserDAO;
import kr.co.starbucks.user.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDaoSupport implements IUserDAO{

	
	@Override
	public void insert(UserDTO userDTO) {
		SqlSession session = this.getSqlSession();
		session.insert("user.insertData",userDTO);
	}
	@Override
	public int selectCountByLoginId(String loginId) {
		return this.getSqlSession().selectOne("user.selectCountByLoginId", loginId);
	}

	@Override
	public int selectCountByEmail(String email) {
	
		return this.getSqlSession().selectOne("user.selectCountByEmail", email);
	}

	@Override
	public int selectCountByPhone(String phone) {
		return this.getSqlSession().selectOne("user.selectCountByPhone", phone);
	}
}

package kr.co.abcde;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.abcde.boardMap.dto.MapDTO;
import kr.co.abcde.boardMap.service.IMapService;
import kr.co.abcde.boardMap.service.impl.MapServiceImpl;
import kr.co.abcde.user.dto.UserDTO;
import kr.co.abcde.user.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TestUser {
	@Autowired private IUserService userService = null;
	UserDTO userDTO = null;
	@Test
	public void write() {
		System.out.println("testestestestestestes=====>");
			UserDTO userDTO = new UserDTO();
			userDTO.setUserId(55);
			userDTO.setLoginId("test6");
			userDTO.setLoginPw("1234");
			userDTO.setEmail("test100@gmail.com");
			userDTO.setName("È«±æµ¿");
			userDTO.setPhone("010-5431-1111");
			userService.write(userDTO);
	}
	/**
	*»ó¼¼Á¶È¸, Á¶È¸, ºä(R)
	*
	**/
	@Test
	public void view() {
		userDTO = userService.view(1);
		System.out.println(userDTO);
	}
	@Test
	public void viewByLoginId() {
		userDTO = userService.viewByLoginId("sincle582");
		System.out.println(userDTO);
	}
}
package kr.co.sincle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.sincle.user.dto.UserDTO;
import kr.co.sincle.user.service.IUserService;
import kr.co.sincle.user.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserTest {
	
	@Autowired private IUserService UserService = null;
	
	@Test
	public void write() {
		UserDTO userDTO = new UserDTO();

		userDTO.setUserId(69);
		userDTO.setEmail("sincle555@aaa.sss");
		userDTO.setLoginId("testt221");
		userDTO.setLoginPw("1234");
		userDTO.setName("조길동");
		userDTO.setPhone("010-7654-7654");
		UserService.write(userDTO);
	}
	
	@Test
	public void edit() {
		UserDTO userDTO = new UserDTO();

		userDTO.setEmail("sincle555@aasd.sss");
		userDTO.setLoginId("sin121");
		userDTO.setLoginPw("1234");
		userDTO.setName("조길동");
		userDTO.setPhone("010-7654-7654");
		userDTO.setStatus(3);
		userDTO.setRole("USER");
		userDTO.setUserId(20);

		UserService.edit(userDTO);
	}
	
	@Test
	public void view() {
		System.out.println(UserService.view(15));
		
	}
	@Test
	public void remove() {
		UserService.remove(29);
	}
}

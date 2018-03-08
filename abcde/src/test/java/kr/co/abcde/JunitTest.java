
package kr.co.abcde;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class JunitTest {
	@Test
	public void test() {
		System.err.println("하나 테스트");
	}
	@Test
	public void test1() {
		System.err.println("둘 테스트");
	}
}

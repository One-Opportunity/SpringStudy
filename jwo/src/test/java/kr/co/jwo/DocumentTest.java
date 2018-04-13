package kr.co.jwo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.jwo.board.dto.BoardDocDTO;
import kr.co.jwo.board.service.IBoardDocService;



@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations={
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DocumentTest {
	@Autowired private IBoardDocService documentService = null;
	BoardDocDTO documentDTO = null;
	
	
	@Test
	public void add() {
		documentDTO = new BoardDocDTO();
		documentDTO.setUserId(10000022);
		documentDTO.setMapId(1);
		documentDTO.setTitle("출첵!!!!!!!!!!!!!할게요!!!!!!");
		documentDTO.setBoardContents("출첵해봅시다~!!!!!!!!!!!!!");
		documentService.add(documentDTO);
	}
	
	@Test
	public void edit() {
		documentDTO = new BoardDocDTO();
		documentDTO.setDocId(104);
		documentDTO.setTitle("변경!!!할게요!!!");
		documentDTO.setBoardContents("변경해봅시다!@@@!@!@!@");
		documentService.edit(documentDTO);
		
	}
	
	@Test
	public void view() {
		System.out.println(documentService.view(101));
		
	}
	
	@Test
	public void viewByMapId() {
		System.out.println(documentService.list(1));
		
	}
	@Test
	public void remove() {
		documentService.remove(100);
	}
}

package kr.co.abcde;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.abcde.boardMap.dto.MapDTO;
import kr.co.abcde.boardMap.service.IMapService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TestMap {
	@Autowired
	private IMapService mapService = null;
	MapDTO mapDTO = null;
	@Test
	public void write() {
		mapDTO = new MapDTO();
		mapDTO.setMapId(13);
		mapDTO.setMapName("퉤스트게시판");
		mapDTO.setMapSort(13);
		mapDTO.setMapType("N");
		mapDTO.setParMapId(3);

		mapService.write(mapDTO);
		
	}
	
	@Test
	public void view() {
		mapDTO = mapService.view(1);
		System.out.println(mapDTO);
	}

}

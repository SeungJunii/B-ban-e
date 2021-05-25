package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//Java Config
//@ContextConfiguration(classes= {org.zerock.config.RootConfig.class})
@Log4j
public class BoardMapperTests {
	
   @Setter(onMethod_ = @Autowired)
   private BoardMapper mapper;
   
   /*
	@Test
	public void testGetList( ) {
		mapper.getList( ).forEach(board -> log.info(board));
	}
		
	@Test
	public void testInsert( ) {
		BoardVO bv = new BoardVO( );
		bv.setTitle("새로 작성한 게시물 제목");
		bv.setContent("새로 작성한 게시물 내용");
		bv.setWriter("새로 작성자");
		
		mapper.insert(bv);
		log.info(bv);
	}
	
	@Test
	public void testInsertSelectKey( ) {
		BoardVO bv = new BoardVO( );
		bv.setTitle("새로 작성한 게시물 제목 select key");
		bv.setContent("새로 작성한 게시물 내용 select key ");
		bv.setWriter("newbie");
		
		mapper.insertSelectKey(bv);
		log.info(bv);
	}
   
   @Test
	public void testRead( ) {
		BoardVO board = mapper.read(29L);
		log.info(board);
	}
	
   
   @Test
	public void testDelete( ) {
	   int num = mapper.delete(29L);
		log.info("삭제된 갯수 :"+num);
	}
	*/
   
   @Test
	public void testUpdate( ) {
		BoardVO bv = new BoardVO( );
		bv.setBno(3l);
		bv.setTitle("새로 작성한 게시물 제목 갱신");
		bv.setContent("새로 작성한 게시물 내용 갱신");
		bv.setWriter("newbie 갱신");
		
		int num = mapper.update(bv);
		log.info("수정된 개수 : " +num);
	}
}
package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
   
   @Setter(onMethod_ = @Autowired)
   private BoardMapper mapper;

   @Override
   public void register(BoardVO board) { // 등록 작업 구현
      // 파라미터로 전달되는 BoardVO 객체를 BoardMapper를 통해서 처리한다.
      log.info("register......" + board);

      mapper.insertSelectKey(board);
   }
   
   @Override
   public List<BoardVO> getList( ) { // 목록 작업 구현
      // 테이블의 모든 데이터를 가져온다.
      log.info("getList..........");

      return mapper.getList( );
   }
   
   

   @Override
   public BoardVO get(Long bno) { // 조회 작업 구현
      // 게시물 번호에 해당하는 게시물 조회
      log.info("get......" + bno);

      return mapper.read(bno);
   }
   
   

   @Override
   public boolean modify(BoardVO board) { // 수정 작업 구현
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean remove(Long bno) { // 삭제 작업 구현
      // TODO Auto-generated method stub
      return false;
   }   
   
}
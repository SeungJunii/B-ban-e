package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		
		log.info("list");
		model.addAttribute("list",  service.getList());
	}
	@PostMapping("/register") // 등록 요청 처리
	   public String register(BoardVO board, RedirectAttributes rttr) {
	      // 리다이렉트(redirect)를 처리할 때 RedirectAttributes 객체(rttr)를 사용한다.    RedirectAttributes 객체는 리다이렉트 시점(등록작업이 끝난 후 목록 화면으로 이동)에 데이터를 일회성으로만 전달할 수 있는 addFlashAttribute( ) 메서드를 지원한다.
	      log.info("register: " + board);
	      service.register(board);
	      rttr.addFlashAttribute("result", board.getBno( ));
	      // 등록작업이 끝난 후 목록 화면으로 이동할 때 새롭게 등록된 게시물의 번호를 "result"라는 키 이름으로 전달한다.(일회성)

	      return "redirect:/board/list";
	      // Handler Method의 반환형이 String이므로 servlet-context.xml의 InternalResourceViewResolver 빈에 설정된 prefix(프리픽스)속성 값과 suffix(서픽스)속성 값을 적용하면 절대 경로는 "/webapp/WEB-INF/views/board/list.jsp"가 된다.
	      // redirect: 접두어는 Spring MVC가 내부적으로 response.sendRedirect( )로 처리한다. 등록, 수정, 삭제 작업은 처리가 완료된 후 다시 동일한 내용을 전송할 수 없도록 URL을 이동하는 방식을 사용한다.
	   }
	
}

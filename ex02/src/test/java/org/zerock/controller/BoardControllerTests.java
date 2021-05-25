package org.zerock.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
// JUnit 프레임워크의 테스트 실행 방법을 확장할 때 사용하는 애너테이션
@WebAppConfiguration
// 테스트할 DI 컨테이너를 웹 애플리케이션 전용 DI 컨테이너로 처리한다.
// Servlet의 ServletContext를 이용하기 위해 사용, 스프링에서 WebApplicationContext를 이용한다.
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
      "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
// @ContextConfiguration는 자동으로 만들어줄 애플리케이션 컨텍스트의 설정파일위치를 지정한다.
@Log4j
public class BoardControllerTests {

   @Setter(onMethod_ = { @Autowired })
   private WebApplicationContext ctx;

   private MockMvc mockMvc;
   /* 웹 애플리케이션을 WAS에 배포하지 않고도 스프링 MVC의 동작을 재현할 수 있는 클래스로 WAS에 배포한 것과 같은 것 처럼 테스트가 가능하다.
    * Spring MVC 테스트를 도와주는 프레임워크로 Spring에서 MVC 패턴으로 작성한 프로그램의 컨트롤러를 시작해서 테스트 해준다. */
   @Before // 테스트 전 작업 진행: 모든 테스트 전에 매번 실행되는 메서드
   public void setup( ) {
      this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build( );
      // MockMvcBuilders는 MockMvc를 초기화 하는 스태틱 클래스
      // webAppContextSetup(ctx)는 WebApplicationContext를 MockMvc 객체로 만들어 MockMvc 객체로 초기화한다.
   }

   @Test
   public void testList( ) throws Exception { // 목록에 대한 처리 테스트      
      log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list")).andReturn( ).getModelAndView( ).getModelMap( ));
      // MockMvc 객체의 perform( )을 이용하여 get, post, put, delete에 대한 요청을 진행
      // 요청을 수행하고 액션들을 체인으로 연결해서 결과 값을 받는다.
      // 인자로 RequestBuilder 인터페이스를 구현한 메서드를 사용한다.
      // get("/board/list")는 매핑을 정의한다. andReturn( )는 테스트한 결과 객체를 받을 때 사용한다.
   }
   
   
}

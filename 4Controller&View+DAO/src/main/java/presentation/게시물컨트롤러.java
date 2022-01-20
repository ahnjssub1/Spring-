package presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import common.Board;
import dataservice.게시물DAO;

@Controller
public class 게시물컨트롤러 {
	@RequestMapping("add")
	ModelAndView 게시물을등록하다(Board board) {
		//1.요청 (제어)
		ModelAndView mv =new ModelAndView();
		//2.(업무) 직접X
		  //  2.1.업무규칙검사 
		          System.out.println("업무 규칙 검사 코드 실행 완료");
		  //  2.2.(DB) 처리
		    게시물DAO dao = new   게시물DAO();
		  dao.저장하다(board);
		  //view 지정
		  mv.setViewName("add");
	   return mv;  
	}
}

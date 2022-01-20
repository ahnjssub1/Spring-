package presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import common.Board;
import dataservice.게시물DAO;
import service.게시물업무;

@Controller
public class 게시물컨트롤러 {
	@RequestMapping("add")
	ModelAndView 게시물을등록하다(Board board) {
		//1.요청 (제어)
		ModelAndView mv =new ModelAndView();
		//2.(업무요청) 직접X
		게시물업무  업무= new 게시물업무();
		업무.등록하다(board);
		//view 지정
		mv.setViewName("add");
	    return mv;  
	}
}

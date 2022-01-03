package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.common.Board;

@Controller
public class 게시물컨트롤러 {
	@RequestMapping("prepare")
	ModelAndView 게시물등록준비하다() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insert");
		return mv;
	}
	
	@RequestMapping("add")
	ModelAndView 게시물등록하다() {
		//데이터와 이동하고자 하는 뷰페이지를 동시에 설정 가능
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:/list"); //이동하고자 하는 뷰이름 저장
		
		Board newBoard = new Board();
		newBoard.setTitle("title");
		newBoard.setContents("contents");
		mv.addObject("newBoard", newBoard); //뷰로 보낼 데이터 저장
		
		return mv; 
	}
	
	@RequestMapping("list")
	void 게시물목록출력하다() {
		System.out.println("실행됨");
	}
	
}

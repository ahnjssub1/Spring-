package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.common.Board;

@Controller
public class 어떤컨트롤러 {
	@RequestMapping("aaa")
	ModelAndView 요청처리자() {
		ModelAndView 모델과뷰 = new ModelAndView();
		모델과뷰.setViewName("abc");
		// 데이터를 view에 보내기 
		모델과뷰.addObject("city", "seoul"); //기본자료형
		모델과뷰.addObject("size", 1);
		
		Board 새게시물 = new Board();
		새게시물.setTitle("tt1");
		새게시물.setContents("ctt1");
		모델과뷰.addObject("newBoard", 새게시물); //java객체
		
		return 모델과뷰;
	}
}

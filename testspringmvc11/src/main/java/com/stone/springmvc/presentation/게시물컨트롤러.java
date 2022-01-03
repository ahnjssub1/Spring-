package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//

@Controller
public class 게시물컨트롤러 {
	
	@RequestMapping("list")
	String 게시물목록출력하다(    ) {
		return "board_list";//board_list.jsp
	}
	
	@RequestMapping("prepare_board")
	String 게시물을등록준비하다(    ) {
		return "prepare_board";
	}
	
	@RequestMapping("add")
	void  게시물을등록하다( String title, String contents) {
		System.out.println(title+"가 등록되었습니다.");
	}
	
}

package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class 게시물컨트롤러 {
	
	@RequestMapping("addboard")
	ModelAndView 게시물등록하다(String title, String contents) {
		System.out.println(title);
		System.out.println(contents);
		
		return null;
	}
	
	@RequestMapping("prepareboard")
	String 게시물등록준비하다() {
		return "게시물등록창";
	}

}

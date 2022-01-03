package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class 어떤컨트롤러 {
	@RequestMapping("aaa")
	ModelAndView 요청처리자() {
		ModelAndView 모델과뷰 = new ModelAndView();
		// view지정 abc.jsp면 "abc" 
		모델과뷰.setViewName("abc");
		return 모델과뷰;
	}
}

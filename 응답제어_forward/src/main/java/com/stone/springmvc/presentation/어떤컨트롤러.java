package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class 어떤컨트롤러 {
	@RequestMapping("ccc")
	ModelAndView C() {
		ModelAndView 모델과뷰 = new ModelAndView();
		모델과뷰.setViewName("forward:/aaa");
		return 모델과뷰; 
	}
	
	
	@RequestMapping("aaa")
	void A() {
		System.out.println("A()실행됨");
	}
	
}

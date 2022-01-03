package com.stone.springmvc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class 어떤컨트롤러 {
	@RequestMapping("bbb")
	String B() {
		return "redirect:/aaa";
	}
	
	
	@RequestMapping("aaa")
	void A() {
		System.out.println("A()실행됨");
	}
	
}

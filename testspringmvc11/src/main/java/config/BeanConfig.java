package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stone.springmvc.presentation.게시물컨트롤러;
import com.stone.springmvc.presentation.회원컨트롤러;

@Configuration
public class BeanConfig {

	@Bean
	게시물컨트롤러 게시물컨트롤러() {
		return new 게시물컨트롤러();
	}
	
	@Bean
	회원컨트롤러 회원컨트롤러() {
		return new 회원컨트롤러();
	}
	
}

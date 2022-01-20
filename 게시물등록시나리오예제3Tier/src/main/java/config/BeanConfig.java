package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stone.springmvc.presentation.게시물관리컨트롤러;
import com.stone.springmvc.service.게시물관리;
import com.stone.springmvc.dataservice.게시물DAO;

@Configuration
public class BeanConfig {
	@Bean
	public 게시물관리컨트롤러 게시물관리컨트롤러( ) {//@Controller 컨트롤링
		return new 게시물관리컨트롤러( );
	}
	@Bean
	public 게시물관리 게시물관리( ) { //@Service 업무로직
		return new 게시물관리( );
	}
	@Bean
	public 게시물DAO 게시물DAO( ) { //@Repository 데이터저장
		return new 게시물DAO( );
	}
	
}

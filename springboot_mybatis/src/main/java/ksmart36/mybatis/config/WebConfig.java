package ksmart36.mybatis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ksmart36.mybatis.interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	private CommonInterceptor commonInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//void니까 실행만 하면 됨
		//모든 주소 요청 "/**" 유의사항 : 
		registry.addInterceptor(commonInterceptor).addPathPatterns("/**").excludePathPatterns("/css/**");
	}
}

package kr.ac.skuniv.javaConfigexam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {
	@Bean
	public MyBean myBean() {		
		return new MyBean("kang");
	}
	
	@Bean
	public MyBean myBean2() {
		MyBean bean = new MyBean();
		bean.setName("kim");
		return bean;
	}
}

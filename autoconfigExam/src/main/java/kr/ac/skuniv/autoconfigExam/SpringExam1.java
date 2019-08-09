package kr.ac.skuniv.autoconfigExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam1 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app-config.xml");
		
		TV tv = context.getBean(TV.class);
		tv.turnOn();
		MyBean bean = context.getBean(MyBean.class);
		bean.setName("kang");
		System.out.println(bean.getName());
	}
	
	
}

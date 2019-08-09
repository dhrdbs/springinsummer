package kr.ac.skuniv.springexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam01 {

	public static void main(String[] args) {
		System.out.println("스프링공장세우기전!!");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("exam01.xml");
		System.out.println("스프링공장세운 후!!");
		
		MyBean mybean = context.getBean("myBean2",MyBean.class);
		
		mybean.setName("kang");
		System.out.println(mybean.getName());
		
		MyBean mybean2 = context.getBean("myBean",MyBean.class);
		mybean2.setName("kim");
		System.out.println(mybean2.getName());
		System.out.println(mybean.getName());
		
		if(mybean == mybean2)
			System.out.println("같은 객체입니다.");
	}

}

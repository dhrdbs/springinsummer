package kr.ac.skuniv.javaConfigexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExam1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		MyBean bean = context.getBean("myBean", MyBean.class);
		// bean.setName("kang");
		System.out.println(bean.getName());

		MyBean bean2 = context.getBean("myBean2", MyBean.class);
		// bean.setName("kang");
		System.out.println(bean2.getName());
	}

}

package testmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import testmy.config.ApplicationConfig;
import testmy.dao.TodoMapper;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		TodoMapper tododao = context.getBean(TodoMapper.class);
		System.out.println(tododao.getTodo(28));
	}

}

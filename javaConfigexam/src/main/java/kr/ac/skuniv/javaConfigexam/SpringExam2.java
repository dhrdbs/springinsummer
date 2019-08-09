package kr.ac.skuniv.javaConfigexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExam2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DiceGameConfig.class);

		Game game = context.getBean(Game.class);
		game.play();

		
	}

}

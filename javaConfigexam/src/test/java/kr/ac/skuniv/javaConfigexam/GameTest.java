package kr.ac.skuniv.javaConfigexam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DiceGameConfig.class)
public class GameTest {
	private Game game;
	
	@Autowired
	public void setGame(Game game) {
		this.game = game;
	}
	
	@Test
	public void play() {
		game.play();
	}
	
}

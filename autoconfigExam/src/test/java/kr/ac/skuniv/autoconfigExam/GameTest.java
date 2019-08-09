package kr.ac.skuniv.autoconfigExam;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/app-config.xml")
public class GameTest {
	@Autowired
	Game game;
	@Autowired
	Player kang;
	@Autowired
	Player kim;
	@Autowired
	Player hong;
	
	@Before
	public void setUp() {
		List<Player> playList = new ArrayList<Player>();
		kang.setName("kang");
		hong.setName("hong");
		kim.setName("kim");
		playList.add(kang);
		playList.add(kim);
		playList.add(hong);
		game.setList(playList);
	}
	@Test
	public void play() {
		game.play();
	}
}

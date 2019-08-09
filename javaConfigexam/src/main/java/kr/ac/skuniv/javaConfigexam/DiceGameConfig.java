package kr.ac.skuniv.javaConfigexam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiceGameConfig {
	@Bean
	public Dice dice() {
		return new Dice(6);
	}	
	@Bean
	public List<Player> dicePlayers(Dice dice){
		List<Player> list = new ArrayList<>();
		Player kang = new Player();
		kang.setName("강경미");
		kang.setDice(dice);
		list.add(kang);
		Player hong = new Player();
		hong.setName("홍길동");
		hong.setDice(dice);
		list.add(hong);
		Player song = new Player();
		song.setName("송혜교");
		song.setDice(dice);
		list.add(song);		
		return list;
	}
	@Bean
	public Game game(List<Player> dicePlayers) {
		Game game = new Game();
		game.setList(dicePlayers);
		return game;
	}
}

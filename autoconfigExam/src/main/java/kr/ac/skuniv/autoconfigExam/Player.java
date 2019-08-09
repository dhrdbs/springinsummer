package kr.ac.skuniv.autoconfigExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Player {
	private String name;
	@Autowired
	private Dice dice;
	
	public Player() {
		System.out.println("player생성!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	public void play() {
		System.out.println(name +"은 주사위를 던져서 "+dice.getNumber()+"가 나왔습니다.");
	}
}

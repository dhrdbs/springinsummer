package kr.ac.skuniv.autoconfigExam;

import org.springframework.stereotype.Component;

@Component
public class Dice {
	private int face;
	
	public Dice() {
		face= 6;
	}
	public Dice(int face) {
		System.out.println("주사위생성!!");
		this.face = face;
	}
	
	public int getNumber() {
		System.out.println("주사위의 getNumber");
		return (int)(Math.random()*face)+1;
	}
}

package kr.ac.skuniv.javaConfigexam;

public class Dice {
	private int face;
	
	public Dice(int face) {
		System.out.println("주사위생성!!");
		this.face = face;
	}
	
	public int getNumber() {
		System.out.println("주사위의 getNumber");
		return (int)(Math.random()*face)+1;
	}
}

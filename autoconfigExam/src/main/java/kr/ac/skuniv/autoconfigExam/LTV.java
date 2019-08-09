package kr.ac.skuniv.autoconfigExam;

public class LTV implements TV {
	public LTV() {
		System.out.println("ltv 생성!!!");
	}
	public void turnOn() {
		System.out.println("LTV의 전원을 켜다");
	}
	public void turnOff() {
		System.out.println("LTV의 전원을 끄다");
	}
	/*public void soundUp() {
		System.out.println("LTV의 소리를 키우다");
	}
	public void soundDown() {
		System.out.println("LTV의 소리를 줄이다");
	}*/
	@Override
	public void 소리를키우다() {
		System.out.println("LTV의 소리를 키우다");
	}
	@Override
	public void 소리를줄이다() {
		System.out.println("LTV의 소리를 줄이다");
		
	}
}

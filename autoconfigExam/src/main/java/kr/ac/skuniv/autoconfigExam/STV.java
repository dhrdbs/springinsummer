package kr.ac.skuniv.autoconfigExam;

import org.springframework.stereotype.Component;

@Component("tv")
public class STV implements TV{
	public STV() {
		System.out.println("stv 생성!!");
	}
//	public void 전원을켜다() {
//		System.out.println("STV 의 전원을켜다");
//	}
//	public void 전원을끄다() {
//		System.out.println("STV 의 전원을끄다");
//	}
	public void 소리를키우다() {
		System.out.println("STV 의 소리를키우다");
	}
	public void 소리를줄이다() {
		System.out.println("STV 의 소리를줄이다");
	}
	@Override
	public void turnOn() {
		System.out.println("STV 의 전원을켜다");
	}
	@Override
	public void turnOff() {
		System.out.println("STV 의 전원을끄다");
	}

}

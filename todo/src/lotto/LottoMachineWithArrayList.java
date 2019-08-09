package lotto;

import java.util.ArrayList;
import java.util.Collections;

public class LottoMachineWithArrayList {
	private ArrayList<Ball> balls;
	public LottoMachineWithArrayList() {
		String[] teams = {"맨뒷조","주지수정","친해지길바래","키보드","할아버지와 손녀","spring in summer","개과천선","사계절","구글"};
		balls = new ArrayList<>();
		for(int i = 0; i < teams.length; i++) {
			balls.add(new Ball(teams[i]));
		}
	}
	public ArrayList<Ball> getBalls() {
		return balls;
	}

	public void setBalls(ArrayList<Ball> balls) {
		this.balls = balls;
	}



	
	public void mix() {
		Collections.shuffle(balls);
	}

	public Ball[] pick() {
		Ball[] resultBalls = new Ball[9];
		for(int i = 0; i < resultBalls.length; i++) {
			resultBalls[i]= balls.get(i);
		}
		return resultBalls;
	}

}

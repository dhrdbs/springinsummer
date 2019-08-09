package lotto;

import java.util.ArrayList;

public class LottoMachineTest {
	public static void printBalls(Ball[] balls) {
		for(int i = 0; i<balls.length; i++) {
			System.out.print(balls[i]+"\t");
		}
		System.out.println();
	}
	public static void printBalls(ArrayList<Ball> balls) {
		for(int i = 0; i<balls.size(); i++) {
			System.out.print(balls.get(i)+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	//	LottoMachine lottoMachine = new LottoMachine();
		LottoMachineWithArrayList lottoMachine = new LottoMachineWithArrayList();
	//	printBalls(lottoMachine.getBalls());
		lottoMachine.mix();
	//	printBalls(lottoMachine.getBalls());
		
		Ball[] resultBalls = lottoMachine.pick();
		System.out.println("발표순서^^");
		int index = 0;
		for (Ball ball : resultBalls) {
			System.out.println( ++index+" : "+ball);
		}
	}

}

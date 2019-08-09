package Lotto;

import java.util.ArrayList;
import java.util.Arrays;

public class Machine {//5개 나오기 
	
	//int []picked=new int[6];
	//int []balls=new int[45];

	ArrayList<Integer>  picked;//1~45까지 랜덤으로 공을 차례6가지를 골라서 picked 에 넣어주기
	ArrayList<Integer>  balls;//0~44 인덱스에 1~45까지 숫자 넣어주기 
	 //1~45까지 모든 공을 다 가지고 있다.

	public Machine() {
	
		 picked=new ArrayList<>();
		 balls=new ArrayList<>();
		 
		for(int i=0;i<45;i++) {
			this.balls.add(i, i+1);
		}
		//System.out.println(balls);
		//System.out.println(picked);
		for(int i=0;i<6;i++) {
			//this.picked.add(i,0);
		}
		
}
	public void pickRandom() {
	
		int i=0;
		while(i<6) {
		

			int p = randomRange(1, 45)-1;// 1~45까지
			int a = this.balls.get(p);

			if (picked.contains(p) == true)//picked array에 같은 숫자가 들어가는걸 방지
				continue;
			else {
				this.picked.add(i, a);//중복이 안되면 picked에 add
				i++;
			
		}
			}
		
		
	}
	 public static int randomRange(int n1, int n2) {
		    return (int) (Math.random() * (n2 - n1 + 1)) + n1;
		  }

}
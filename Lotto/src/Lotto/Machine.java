package Lotto;

import java.util.ArrayList;
import java.util.Arrays;

public class Machine {//5�� ������ 
	
	//int []picked=new int[6];
	//int []balls=new int[45];

	ArrayList<Integer>  picked;//1~45���� �������� ���� ����6������ ��� picked �� �־��ֱ�
	ArrayList<Integer>  balls;//0~44 �ε����� 1~45���� ���� �־��ֱ� 
	 //1~45���� ��� ���� �� ������ �ִ�.

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
		

			int p = randomRange(1, 45)-1;// 1~45����
			int a = this.balls.get(p);

			if (picked.contains(p) == true)//picked array�� ���� ���ڰ� ���°� ����
				continue;
			else {
				this.picked.add(i, a);//�ߺ��� �ȵǸ� picked�� add
				i++;
			
		}
			}
		
		
	}
	 public static int randomRange(int n1, int n2) {
		    return (int) (Math.random() * (n2 - n1 + 1)) + n1;
		  }

}
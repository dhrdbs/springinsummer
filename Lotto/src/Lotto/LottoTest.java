package Lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LottoTest {
	public static void main(String[] args) {
	
		Machine m1=new Machine();
		//show(m1.picked);
		//show(m1.balls);
		m1.pickRandom();
		show1(m1.picked);
		//m1.pickRandom();
		//m1.show();
		//Scanner scan=new Scanner(System.in);

	
	}
	public static void show(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void show1(ArrayList<Integer> a) {
		System.out.println(a);
	}
	public static void show2(ArrayList<Integer> a) {
		for(int i=0;i<6;i++) {
		
		}
	}
	
	
}

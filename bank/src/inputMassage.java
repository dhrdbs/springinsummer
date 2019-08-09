package BankExam;

import java.util.Scanner;

public class inputMassage {
	public String StringMassage() {		
		String inputmassage;
		Scanner scn = new Scanner(System.in);
		inputmassage = scn.nextLine();
		
		return inputmassage;
	}
	public int intMassage() {		
		String inputmassage;
		Scanner scn = new Scanner(System.in);
		inputmassage = scn.nextLine();
		
		return Integer.parseInt(inputmassage);
	}
}

package BankExam;

import java.util.Date;

public class BankOpen {
	inputMassage massage = null;
	String name;
	int balance, userNumber;
	int password;
	
	public bankBook BankOpen() {
			bankBook bankbook=null;
		
			massage = new inputMassage();
			System.out.println("통장을 만들기위해 개인정보를 입력해주세요.");
			System.out.print("이름:");
			name = massage.StringMassage();
			System.out.print("주민번호:");
			userNumber  = massage.intMassage();
			
			
			try {
				password = BankSetPw();
				System.out.print("통장 개설시 입금할 금액:");
				balance = massage.intMassage();
				bankbook = new bankBook(name, userNumber, balance, password);
				bankBookDao bankbookInsert = new bankBookDao();
				bankbookInsert.bankBookOpen(bankbook);
				System.out.println("통장이 개설되었습니다.");
			}catch(WithdrawException e){
				e.printStackTrace();
				System.out.println("통장 개설에 실패했습니다.");
			}
			
			return bankbook;
	}
	
	public int BankSetPw(){
		int password=0, rePassword;
		boolean check=false;
		massage = new inputMassage();
		
		while(!check) {
			System.out.println("새로운 비밀번호를 입력해주세요:");
			password=massage.intMassage();
			System.out.println("비밀번호를 다시 입력해주세요:");
			rePassword=massage.intMassage();
			
			if(password==rePassword) {
				check = true;
			}else {
				System.out.println("비빌번호가 서로 일치하지 않습니다.");
			}
		}
	
		return password;
	}
}

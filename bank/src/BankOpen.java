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
			System.out.println("������ ��������� ���������� �Է����ּ���.");
			System.out.print("�̸�:");
			name = massage.StringMassage();
			System.out.print("�ֹι�ȣ:");
			userNumber  = massage.intMassage();
			
			
			try {
				password = BankSetPw();
				System.out.print("���� ������ �Ա��� �ݾ�:");
				balance = massage.intMassage();
				bankbook = new bankBook(name, userNumber, balance, password);
				bankBookDao bankbookInsert = new bankBookDao();
				bankbookInsert.bankBookOpen(bankbook);
				System.out.println("������ �����Ǿ����ϴ�.");
			}catch(WithdrawException e){
				e.printStackTrace();
				System.out.println("���� ������ �����߽��ϴ�.");
			}
			
			return bankbook;
	}
	
	public int BankSetPw(){
		int password=0, rePassword;
		boolean check=false;
		massage = new inputMassage();
		
		while(!check) {
			System.out.println("���ο� ��й�ȣ�� �Է����ּ���:");
			password=massage.intMassage();
			System.out.println("��й�ȣ�� �ٽ� �Է����ּ���:");
			rePassword=massage.intMassage();
			
			if(password==rePassword) {
				check = true;
			}else {
				System.out.println("�����ȣ�� ���� ��ġ���� �ʽ��ϴ�.");
			}
		}
	
		return password;
	}
}

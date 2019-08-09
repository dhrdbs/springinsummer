package BankExam;

public class bankTask {	
	int Tasktype=0;

	
	bankBook userbankbook=null;
	inputMassage massage = null;
	bankBookDao bankBookdao = null;
	bankBook bankbook = null;
	
	bankTask() {
		this.userbankbook = bankSetup();
		bankTaskSelect();
	}
	
	public void bankTaskSelect(){
		int choice;
		
		massage = new inputMassage();
		
		System.out.println("입금 또는 출금을 선택해주세요.");
		System.out.print("(1)입금     (2)출금:");
		choice = massage.intMassage();
		if(choice ==1) {
			banksave();
			bankinfo(userbankbook);
			System.out.println("입금되었습니다.");
			System.out.println();
		}else if(choice==2) {
			bankwithdraw();
			System.out.println("출금되었습니다.");
			bankinfo(userbankbook);
			System.out.println();
		}else {
			System.out.println("잘못누르셨습니다.");
		}
	}
	
	public bankBook bankSetup(){
		int bankid=0;
		
		bankBook bankbook = null;
		massage = new inputMassage();
		
		System.out.print("계좌번호를 입력해주세요:");
		bankid = massage.intMassage();	
		
		bankBookdao = new bankBookDao();
		bankbook = bankBookdao.bankBookselect(bankid);
		
		bankinfo(bankbook);
		
		return bankbook;
	}
	
	public void banksave(){
		int money;
		System.out.print("입금금액을 입력해주세요:");
		money = massage.intMassage();
		
		int balance = userbankbook.getBalance()+money;
		userbankbook.setBalance(balance);
		
		bankBookdao = new bankBookDao();
		bankBookdao.bankBookUpdate(userbankbook);
	}
	
	public void bankwithdraw(){
		int money, balance;
		try {
		System.out.print("출금금액을 입력해주세요:");
		money = massage.intMassage();
		
		balance = withdrawal(money);	
		userbankbook.setBalance(balance);
		
		bankBookdao = new bankBookDao();
		bankBookdao.bankBookUpdate(userbankbook);
		}catch(WithdrawException e){
			e.printStackTrace();
			System.out.println("출금 취소");
			System.out.println("잔액:"+userbankbook.getBalance());
		}
	}
	
	private void bankinfo(bankBook bankbook) {
		System.out.println();
		System.out.println("SKU통장");
		System.out.println("통장번호 :"+bankbook.getBankid());
		System.out.println("소유자 :"+bankbook.getName());
		System.out.println("개설날짜: "+bankbook.getJoinDate());
		System.out.println("잔액: "+bankbook.getBalance());
		System.out.println();
	}
	
	public int withdrawal(int withdrawal) throws WithdrawException{
		int result =  userbankbook.getBalance()- withdrawal;
		if(result < 0) {
			throw new WithdrawException("잔액이 부족합니다.");
		}
		return result;
	}
}

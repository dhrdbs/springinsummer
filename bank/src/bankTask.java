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
		
		System.out.println("�Ա� �Ǵ� ����� �������ּ���.");
		System.out.print("(1)�Ա�     (2)���:");
		choice = massage.intMassage();
		if(choice ==1) {
			banksave();
			bankinfo(userbankbook);
			System.out.println("�ԱݵǾ����ϴ�.");
			System.out.println();
		}else if(choice==2) {
			bankwithdraw();
			System.out.println("��ݵǾ����ϴ�.");
			bankinfo(userbankbook);
			System.out.println();
		}else {
			System.out.println("�߸������̽��ϴ�.");
		}
	}
	
	public bankBook bankSetup(){
		int bankid=0;
		
		bankBook bankbook = null;
		massage = new inputMassage();
		
		System.out.print("���¹�ȣ�� �Է����ּ���:");
		bankid = massage.intMassage();	
		
		bankBookdao = new bankBookDao();
		bankbook = bankBookdao.bankBookselect(bankid);
		
		bankinfo(bankbook);
		
		return bankbook;
	}
	
	public void banksave(){
		int money;
		System.out.print("�Աݱݾ��� �Է����ּ���:");
		money = massage.intMassage();
		
		int balance = userbankbook.getBalance()+money;
		userbankbook.setBalance(balance);
		
		bankBookdao = new bankBookDao();
		bankBookdao.bankBookUpdate(userbankbook);
	}
	
	public void bankwithdraw(){
		int money, balance;
		try {
		System.out.print("��ݱݾ��� �Է����ּ���:");
		money = massage.intMassage();
		
		balance = withdrawal(money);	
		userbankbook.setBalance(balance);
		
		bankBookdao = new bankBookDao();
		bankBookdao.bankBookUpdate(userbankbook);
		}catch(WithdrawException e){
			e.printStackTrace();
			System.out.println("��� ���");
			System.out.println("�ܾ�:"+userbankbook.getBalance());
		}
	}
	
	private void bankinfo(bankBook bankbook) {
		System.out.println();
		System.out.println("SKU����");
		System.out.println("�����ȣ :"+bankbook.getBankid());
		System.out.println("������ :"+bankbook.getName());
		System.out.println("������¥: "+bankbook.getJoinDate());
		System.out.println("�ܾ�: "+bankbook.getBalance());
		System.out.println();
	}
	
	public int withdrawal(int withdrawal) throws WithdrawException{
		int result =  userbankbook.getBalance()- withdrawal;
		if(result < 0) {
			throw new WithdrawException("�ܾ��� �����մϴ�.");
		}
		return result;
	}
}

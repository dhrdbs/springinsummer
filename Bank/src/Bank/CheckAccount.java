package Bank;

public class CheckAccount {
	private String accountNumber; //�����ȣ
	private String name; //�̸�
	private int balance; //�ܾ�
	
	public CheckAccount() {
	}
	
	public CheckAccount(String accountNumbr, String name, int balance) {
		this.accountNumber = accountNumbr;
		this.name = name;
		this.balance = balance;
	}
	//�Ա��ϴ�
	public void deposit(int money) {
		System.out.printf("%s���� %s ���忡 %d �Ա޿Ϸ�!!\n", name,accountNumber,money);
		balance += money;
	}
	//����ϴ�
	public void withdraw(int money) throws BankExcepion{
		if(balance < money)
			throw new BankExcepion("����� �׼��� �ܾ׺��� �����ϴ�. �ܾ� : "+balance);
		System.out.printf("%s���� %s ���忡 %d ��ݿϷ�!!\n", name,accountNumber,money);
		balance -= money;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

package Bank;

public class CheckAccount {
	private String accountNumber; //통장번호
	private String name; //이름
	private int balance; //잔액
	
	public CheckAccount() {
	}
	
	public CheckAccount(String accountNumbr, String name, int balance) {
		this.accountNumber = accountNumbr;
		this.name = name;
		this.balance = balance;
	}
	//입금하다
	public void deposit(int money) {
		System.out.printf("%s님이 %s 통장에 %d 입급완료!!\n", name,accountNumber,money);
		balance += money;
	}
	//출금하다
	public void withdraw(int money) throws BankExcepion{
		if(balance < money)
			throw new BankExcepion("출금할 액수가 잔액보다 많습니다. 잔액 : "+balance);
		System.out.printf("%s님이 %s 통장에 %d 출금완료!!\n", name,accountNumber,money);
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

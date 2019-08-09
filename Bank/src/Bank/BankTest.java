package Bank;

public class BankTest {

	public static void main(String[] args) {
		CheckAccount checkAccount = 
				new CheckAccount("1111", "kang", 50000);
		try {
			checkAccount.withdraw(40000);
			checkAccount.deposit(10000);
			checkAccount.withdraw(50000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

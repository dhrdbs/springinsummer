package Bank;

public class BankExcepion  extends RuntimeException{
	public BankExcepion() {
		super("은행에서 예외발생!!");
	}
	public BankExcepion(String msg) {
		super(msg);
	}
}

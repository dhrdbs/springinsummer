package Bank;

public class BankExcepion  extends RuntimeException{
	public BankExcepion() {
		super("���࿡�� ���ܹ߻�!!");
	}
	public BankExcepion(String msg) {
		super(msg);
	}
}

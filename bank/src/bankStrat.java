package BankExam;

public class bankStrat {
	bankBook bankbook=null;
	
	public void bankStrat(){
		int choice=4;
		
		System.out.println("SKU은행입니다.");
		System.out.println("업무를 선택해주세요.");
		while(choice!=0) {
			System.out.print("(1)통장 만들기   (2)입출금하기   (3)통장정리  (0)나가기:");
			choice = choice();
			
			 switch (choice) {
	            case 1:
	            	BankOpen bankopen = new BankOpen();
	    			bankbook = bankopen.BankOpen();		
	            	System.out.println();
	                break;
	            case 2:  
	            	bankTask bankTask = new bankTask();
	            	System.out.println();
	                break;
	            case 3:  
	            	
	            	System.out.println();
	            	break;
	            case 0:
	            	System.out.println("안녕히가십시오.");
	            	break;
	            default:
	            	System.out.println("잘못입력하셨습니다.");
	            
	        }
		}
		
		
		
	}
	
	public int choice() {
		int choice;
		
		inputMassage intmassage = new inputMassage();	
		choice = intmassage.intMassage();
		
		return choice;
	}
}

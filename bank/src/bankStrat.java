package BankExam;

public class bankStrat {
	bankBook bankbook=null;
	
	public void bankStrat(){
		int choice=4;
		
		System.out.println("SKU�����Դϴ�.");
		System.out.println("������ �������ּ���.");
		while(choice!=0) {
			System.out.print("(1)���� �����   (2)������ϱ�   (3)��������  (0)������:");
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
	            	System.out.println("�ȳ������ʽÿ�.");
	            	break;
	            default:
	            	System.out.println("�߸��Է��ϼ̽��ϴ�.");
	            
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

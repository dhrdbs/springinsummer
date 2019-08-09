package Exception;

public class ExceptionTest {//예외처리하기 
	public static void main(String[] args) {
		int [] intArray=new int [5];
		intArray[0]=0;
		for(int i=0;i<5;i++) {
			try {
				intArray[i+1]=i+1+intArray[i];
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("intArray["+i+"]is error");
				continue;
			}
			
			System.out.println("intArray["+i+"]="+intArray[i]);
			
		}
	}
}

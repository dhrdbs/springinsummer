package Exception;

public class ExceptionTest {//����ó���ϱ� 
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

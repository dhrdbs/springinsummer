package Shapes;

public interface Drawable {
	public void draw();
	
	//8���� ���� �߰��� default,static
	default void exec(int t,int j) {
		
	}
	static void sm() {//static�� �������̵� �ȵ�,���� �޸𸮿� �ö󰡴ϱ� 
		
		
	}

}

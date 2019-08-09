package Shapes;

public interface Drawable {
	public void draw();
	
	//8버전 부터 추가된 default,static
	default void exec(int t,int j) {
		
	}
	static void sm() {//static은 오버라이드 안됨,먼저 메모리에 올라가니까 
		
		
	}

}

package Shapes;

public class Circle extends Shape implements Drawable{//추상클래스 shape를 상속받다
	
	int r;
	
	public Circle(int i) {
		this.r=i;
	}
	//추상클래스 shape의 모든 추상메소드  구현하기 
	@Override
	public double calculateArea() {//추상 메소드 
		// TODO Auto-generated method stub
		double s=3.14*this.r*this.r;
		return s;
	}
	@Override
	public void draw() {//인터페이스 메소드 
		// TODO Auto-generated method stub
		System.out.println("이 객체는 원입니다.");
		
	}



}

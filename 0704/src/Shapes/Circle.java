package Shapes;

public class Circle extends Shape implements Drawable{//�߻�Ŭ���� shape�� ��ӹ޴�
	
	int r;
	
	public Circle(int i) {
		this.r=i;
	}
	//�߻�Ŭ���� shape�� ��� �߻�޼ҵ�  �����ϱ� 
	@Override
	public double calculateArea() {//�߻� �޼ҵ� 
		// TODO Auto-generated method stub
		double s=3.14*this.r*this.r;
		return s;
	}
	@Override
	public void draw() {//�������̽� �޼ҵ� 
		// TODO Auto-generated method stub
		System.out.println("�� ��ü�� ���Դϴ�.");
		
	}



}

package Shapes;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle(5);
		System.out.println(c.calculateArea());
		
		Shape r=new Rectangle(10,4);
		System.out.println(r.calculateArea());
		
		//draw�޼ҵ常 ����Ϸ��� 
		Drawable d=(Drawable) c;
		d.draw();
		

	}

}

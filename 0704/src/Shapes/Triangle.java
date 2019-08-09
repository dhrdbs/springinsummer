package Shapes;

public class Triangle  extends Shape{

	double below,height;
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double s=this.below*this.height;
		return s;
	}

}

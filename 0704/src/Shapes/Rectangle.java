package Shapes;

public class Rectangle  extends Shape{

	double below,height;
	
	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.below=i;
		this.height=j;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		
		double s=below*height*(1/3);
		return s;
	}

}

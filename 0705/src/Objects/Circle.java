package Objects;

public class Circle {

	

	int x,y,radius;
	public Circle(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.x=i;
		this.y=j;
		this.radius=k;
	}
	
	public boolean equlas(Circle c) {
		if(this.radius==c.radius) {
			return true;
		}else {
			return false;

		}
		
	}

}

package Objects;

public class Point {
protected int x,y;
	
	public Point() {//생성자
		// TODO Auto-generated constructor stub
	}


	public Point(int d, int i) {//생성자,객체가 생성될때 딱 한번 실행되는거 
		// TODO Auto-generated constructor stub
		this.x = d;
		this.y = i;
	}
	public String toString() {//toString오버라이드
		return "Pint("+x+","+y+")";
		
	}
	public boolean equlas(Point p) { //equlas 오버라이드
		if(x==p.x&&y==p.y) {
			return true;
			
		}else {
			return false;
			
		}
	
		
	}

}

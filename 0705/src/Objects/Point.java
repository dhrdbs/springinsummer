package Objects;

public class Point {
protected int x,y;
	
	public Point() {//������
		// TODO Auto-generated constructor stub
	}


	public Point(int d, int i) {//������,��ü�� �����ɶ� �� �ѹ� ����Ǵ°� 
		// TODO Auto-generated constructor stub
		this.x = d;
		this.y = i;
	}
	public String toString() {//toString�������̵�
		return "Pint("+x+","+y+")";
		
	}
	public boolean equlas(Point p) { //equlas �������̵�
		if(x==p.x&&y==p.y) {
			return true;
			
		}else {
			return false;
			
		}
	
		
	}

}

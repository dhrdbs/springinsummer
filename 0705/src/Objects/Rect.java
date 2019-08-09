package Objects;

public class Rect {
	
	int a,b;
	public Rect(int i, int j) {
		this.a=i;
		this.b=j;
	}
	public boolean equlas(Rect p) { //equlas 오버라이드
		if(this.a==p.a&&this.b==p.b) {
			return true;
			
		}else {
			return false;
			
		}
	
		
	}

}

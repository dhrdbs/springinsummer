package Objects;

public class ObjectTest {
	public static void main(String[] args) {
		Point point=new Point(2,3);
		
		System.out.println(point.getClass().getName());//toStirng �� ȣ���Ѱ� 
		System.out.println(point.hashCode());
		System.out.println(point.toString());
		System.out.println(point);
		
		Rect a=new Rect(2,3);
		Rect b=new Rect(3,32);
		if(a.equlas(b)) {
			System.out.println("x,y ���� ");

		}else
		{
			System.out.println("x,y �޶�");
		}
		
		Circle c=new Circle(1,2,3);
		Circle c2=new Circle(2,1,3);
		if(c.equlas(c2))
			System.out.println("�������� ����");
		else {
			System.out.println("�������� �ٸ���");
		}
		
		
		
		String str="aBcaBcabcABC";
		//3��° ���ڿ� ����
		System.out.println(str.charAt(3));
		System.out.println(str.substring(0, 3));
		str.substring(0, 4);
		str.length();
		str.toUpperCase();
		
		
		StringBuffer sb= new StringBuffer("this");
		System.out.println(sb);
		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
	}

	

}

package Objects;

import java.util.Calendar;
//1-�޷����
//2-�ζ�
//3-����

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		printDate(c);
		c.set(2013, 5, 12);
		
	}
	public static void printDate(Calendar c) 
	{
		System.out.println(c.get(Calendar.DAY_OF_YEAR)+"��"
				+ (c.get(c.DATE)+"d��"));
	}

}

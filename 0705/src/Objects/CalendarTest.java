package Objects;

import java.util.Calendar;
//1-달력출력
//2-로또
//3-은행

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		printDate(c);
		c.set(2013, 5, 12);
		
	}
	public static void printDate(Calendar c) 
	{
		System.out.println(c.get(Calendar.DAY_OF_YEAR)+"년"
				+ (c.get(c.DATE)+"d일"));
	}

}

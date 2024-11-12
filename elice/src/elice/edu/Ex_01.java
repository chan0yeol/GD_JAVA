package elice.edu;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
//			Locale.setDefault(Locale.KOREAN);
		  Scanner scan = new Scanner(System.in);
		  int year = scan.nextInt();
		  int mon = scan.nextInt();
		  Calendar c = Calendar.getInstance();
		  c.set(year,mon-1);
		  int lastDay = c.getActualMaximum(mon);
		  c.set(year, mon-1, lastDay);
		  int dayOfWeek = c.get(Calendar.DAY_OF_WEEK)-1;
		  System.out.println("asd");
	}
}

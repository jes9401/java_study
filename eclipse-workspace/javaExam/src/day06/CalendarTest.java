package day06;
import java.util.Calendar;
public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c);
	}
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Calendars {
	public static void main(String[]arg) 
	{
		
		String str = "2030-3-20" ;
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date d = format.parse(str);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		cal.set(cal.DATE,1);
		
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		int j = 0 ;
		
		for(int i =0 ; i < 31 ; i++)
		{
			
			System.out.print(i+"\t");
			j++ ;
			if(j%7==0) {
				System.out.println();
			}
		}
	}
}

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Date {

	public static void main(String[] arg) {

		String str;
		Scanner in = new Scanner(System.in);
		str = in.next();
		//将字符串转换成时间对象
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date d;

		try {
			//将字符串转成DATE对象
			d = format.parse(str);
			Calendar cal=new GregorianCalendar();
			cal.setTime(d);
			
			cal.set(Calendar.DATE, 1);
			int we = cal.get(Calendar.DAY_OF_WEEK);
//			System.out.println();
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			int days = cal.getActualMaximum(Calendar.DATE);
//			System.out.println(days);
			int j = 0;
			System.out.println(days);
//			for (int i = 1; i <= days; i++) {
//
//				if(j==0) {
//					for (int k = 1; k < we; k++) {
//						j++;
//						System.out.printf(" \t");
//					}
//					System.out.print(i + "\t");
//					j++;
//				} else if (j % 7 != 0) {
//					System.out.print(i + "\t");
//				} else {
//					System.out.print(i + "\t\n");
//					System.out.println();
//					;
//				}
//				j++;
//			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.sql.Date;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date dd = new Date() ;
			long t = System.currentTimeMillis() ;
			System.out.println(t) ;
			Date d2 = new Date(199) ;
			System.out.println(d2.toGMTString());
			d2.setTime(111111111);
			System.out.println(d2.getTime());
			//字符串和时间的转化,抽象类,不能new
			//格式化字符串
			DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
			Date d = new Date(1234343242) ;
			//将时间对像转化成字符串
			String s = df.format(d) ;
			System.out.println(s);
			String str = "1977-2-8";
			DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date d3 =df2.parse(str);
				System.out.println(d3.toLocaleString());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

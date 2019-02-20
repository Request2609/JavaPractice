import java.util.Calendar;

public class Test3 {

    public static void printCalender() {
        int year = 2015;
        int month = 2;
        //input
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK); //求本月第一天是星期几
        int count = startDay - 1; //第一周的初始计数
        int maxDay = maxDayInMonth(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        fillSpace(startDay);
        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d%s", i, " "); //使用printf函数进行格式对齐
            count++;
            if (count >= 7) { //每输出7天换一次行
                count = 0;
                System.out.print('\n');
            }
        }
    }

    public static void fillSpace(int startDay) {
        for (int i = 1; i < startDay; i++) {
            System.out.printf("%4s", " ");
        }
    }

    public static int maxDayInMonth(int year, int month) {
        int max = 30;
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) max = 31;
        else if (month == 2) max = 28;
        else if (month == 2 && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) max = 29;
        return max;
    }

    public static void main(String[] args) {
        printCalender();
    }
}

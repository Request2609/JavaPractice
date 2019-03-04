import java.util.Arrays;
import java.util.Scanner;
//中心扩展算法:
public class DPTest {

	public static String getLongest(String s) {

		if (s == null || s.length() < 1)
			return "";
		String str1;
		String str2;
		String max = new String();
		max = "";
		for (int i = 0; i < s.length() - 1; i++) {
			//从自身开始向外扩展
			str1 = getArround((s), i, i);
			//比较自身和相邻的元素开始向外扩展
			str2 = getArround((s), i, i + 1);
			//判断找出最长的字串
			String temp = str1.length() > str2.length() ? str1 : str2;
			//在当前最长的字串和之前最长字串之间找出最长的
			if (temp.length() > max.length()) {
				max = temp;
			}
		}
		return max;
	}

	public static String getArround(String s, int l, int r) {

		boolean flag = false;
		//左右指针向外扩展,可扩展的条件
		while (l >= 0 && s.charAt(l) == s.charAt(r) && r < s.length()) {
			l--;
			r++;
			flag = true;
		}
		if (flag == true) {
			if (l < 0 || r > s.length() || s.charAt(l) != s.charAt(r)) {
				l += 1;
			}
		}
		return s.substring(l, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = new String();
		s = in.next();
		System.out.println(getLongest(s));
	}
}

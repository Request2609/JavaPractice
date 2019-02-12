
//string 不可变字符序列
//可变字符序列
//stringBuffer线程安全,效率低
//stringBuilder线程不安全,效率高

public class test1 {
	public static void main(String argc[]) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(32);
		StringBuilder sb2 = new StringBuilder("chang");
		sb2.append("abc");
		System.out.println(sb1);
		System.out.println(sb2);
	}
}

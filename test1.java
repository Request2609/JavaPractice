
//string 不可变字符序列
//可变字符序列
//stringBuffer线程安全,效率低
//stringBuilder线程不安全,效率高

public class test1 {
	public static void main(String argc[]) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(32);
		StringBuilder sb2 = new StringBuilder("chang");
		sb2.append("abc").append(false);
		System.out.println(sb1);
		System.out.println(sb2);
		//删除数组中元素,包头不包尾
		sb2.delete(3, 5);
		System.out.println(sb2);
		sb2.replace(2, 5, "232");
		System.out.println(sb2);
		sb.reverse();
		System.out.println(sb2);
	}
}
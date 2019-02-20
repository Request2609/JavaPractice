import java.util.HashSet;
import java.util.Set;

//equals和hashCode
//两个相同的对象应该具有相同的hashCode

//map底层实现
//LinkedList按照索引查找,判断索引位置是在前半部分还是后半部分
//size>>1 向右移一位
//set 集合,无序,不可重复.
//hashSet底层实现是通过hashMap实现的

public class Test002{
		
	public static void main(String[]args) {
		Set set = new HashSet();
		set.add("a");
		set.add("a");
		set.add("b");
		//此处set里面含两个元素
		System.out.println(set.size());
	}
}
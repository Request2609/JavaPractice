import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Iterat {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("aaa");
		list.add("ddd");
		for(int i= 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Set set = new HashSet();
		set.add("aaa");
		set.add("sss");
		set.add("ccc");
		
		//通过迭代器遍历set
//		Iterator iter = set.iterator();
//		while(iter.hasNext())
		//remove 删除游标左边的元素
		for(Iterator iter = set.iterator() ;iter.hasNext();) {
			//next 返回当前游标指向的对象,并将游标移向下一位
			String str = (String)iter.next();
			System.out.println(str);
		}
	}
}

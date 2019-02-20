import java.util.ArrayList;
import java.util.List;

//set无序不可重复
//list有序可重复
//map键值对
//ArrayList底层实现是数组,查询快,插入删除慢
//LinkList 链表,修改删除快,查询慢,线程不安全
//Vector 线程安全
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls = new ArrayList();
		ls.add(new Date());
		ls.add(1234);
		int a = ls.size();
		 
	}

}

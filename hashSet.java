import java.util.HashMap;

//自己实现hashSet

public class hashSet {

	HashMap map ;
	
	private static final Object PRESENT = new Object();
	int size ;
	public  hashSet() {
		map = new HashMap();
	}
	
	public int size() {
		return size ;
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);//利用map键对象的不可重复
	}
	
	public static void main(String[]args) {
		hashSet s = new hashSet();
		s.add("nnnnn");
		s.add("pppp");
	}
}

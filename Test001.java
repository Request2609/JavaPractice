import java.util.LinkedList;

//自定义map,提高查询效率

public class Test001 {
	
	LinkedList[] arr = new LinkedList[999];
	
	int size ;
	
	public void put(Object key , Object value) {
//		System.out.println(key.hashCode());
		SxtEntry e = new SxtEntry(key,value);
		
		int a = key.hashCode()%999 ;
		if(arr[a]==null) {
			LinkedList list = new LinkedList();
			list.add(e);
		}else {
			arr[a].add(e);
		}
	}
	
	
	//map底层实现 数组+链表
	//根据键值返回对象
	public Object get(Object key) {
		
//		return arr[key.hashCode()%999];
		int a = key.hashCode()%999 ;
		if(arr[a]!=null) {
			LinkedList ls = arr[a] ;
			for(int i=0;i<ls.size();i++) {
				SxtEntry e = (SxtEntry)ls.get(i);
				if(e.equals(key)) {
					return e.value;
				}
			}
		}
		
		return null ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}

class SxtEntry{
	
	Object key;
	Object value ;
	
	public SxtEntry() {
	}
	
	public SxtEntry(Object key ,Object value) {
		this.key = key ;
		this.value = value ;
	}
}
import java.util.HashMap;
import java.util.Map;

//map键值对关联容器

public class Mains {
	public static void main(String args[]) {
		Map map = new HashMap();
		map.put("高琪", new Wife("张曼玉"));
		map.put("张三",new Wife("样米"));
		Wife w = (Wife)map.get("高琪");
		System.out.println(w.name);
		map.remove("高琪");
		map.containsKey("张三");
		map.containsValue("高琪");
		map.isEmpty();
	}
}

class Wife{
	String name ;
	public Wife(String name) {
		this.name = name ;
	}
}
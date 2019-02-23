import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//使用map关联容器来封装数据

public class Test23 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("id", 9);
		map.put("name","gao");
		map.put("salary",3050);
		map.put("department","教学部门");
		map.put("hireDate","2006-10");
		
		List<Map>list = new ArrayList<Map>();
		list.add(map);
	}
	
	public static void printEmpName(List<Map>list) {
		for(int i=0 ;i <list.size();i++) {
			Map  map = list.get(i);
			System.out.println(map.get("name"));
		}
	}
}


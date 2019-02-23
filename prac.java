import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class prac {

	public static void main(String[] args) {
		Employee e = new Employee(1,"gao",3000,"xia","2007-10");
//		e.setId(0301);
//		e.setName("范冰冰");
//		e.setDepartment("项目");
//		e.setSalary(3000);
//		String strDate = "2007-10";
		List<Employee>list = new ArrayList<Employee>();
		list.add(e);
		printEmpName(list);
//		DateFormat format = new SimpleFormat("yyyy-mm");
	}
	public static void printEmpName(List<Employee>list) {
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}
}


class Employee {

	private int id;
	private String name;
	private int salary;
	private String department;
	private Date hireDate;
	
	public Employee() {
		
	}
	public Employee(int id,String name ,int salary,String depart,String hireDate) {
		this.id= id ;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
}
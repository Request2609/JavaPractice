//自动装箱拆箱

public class Test2 
{	
	public static void main(String[]arg)
	{
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		//自动装箱
		//在编译时,编译器自动将代码修改了.
		Integer a = 1000 ;
		
		Integer c = 100 ;
		int b = c ;//相当于c.intValue();
	}
}


//实现ArrayList类 

class Arraylist
{
	Object[] value ;
	int size ;
	
	public Arraylist()
	{
		size = 0 ;
		value = new Object[size] ;
	}
	
	public Arraylist(int num)
	{
		value = new Object[num];
	}
	
	public void add(Object obj)
	{
		
		value[size] = obj ;
		size++ ;
		if(size >= value.length)
		{
			int newCapacity = value.length*2 ;
			Object[] newlist = new Object[newCapacity] ;
			
			for(int i = 0 ; i<value.length ; i++)
			{
				newlist[i] = value[i] ;
			}
			value = newlist ;
		}
	}
	
	public Object get(int i)
	{
		
		if(i > size-1 || i<0 )
		{
			
			try{
				throw new Exception();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return value[i] ;
	}
	
}

public class Test1 {
	
	public static void main(String[]arg){
			Arraylist list = new Arraylist();
					
	}
}

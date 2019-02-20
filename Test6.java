import java.io.File;

public class Test6 
{
	public static void main(String[]args)
	{
		File f = new File("/home/changke/java_practice/Practice");
		Print(f,0);
	}
	
	public static void Print(File f,int level)
	{
		for(int i =0 ; i < level ; i++)
		{
			System.out.print("-");
		}
		System.out.println(f.getName());
		if(f.isDirectory())
		{
			System.out.println("++++++");
			File[] files = f.listFiles();
			for(File temp :files)
			{
				Print(temp,level+1);
			}
		}
	}
}


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyException extends Exception{
	
	public MyException() 
	{
	}
	public MyException(String message)
	{
		super(message);
	}
}
public class Excep
{
	
	void test()throws MyException{
	}
	
	public static void main(String []aeg) throws MyException, FileNotFoundException
	{
		FileReader f = null;
		try {
			f=new FileReader("/home/changke/1.txt") ;
			try {
				char a = (char)f.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch( FileNotFoundException e){
				e.printStackTrace();
		}finally {
			try{
				if(f!=null)
					f.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

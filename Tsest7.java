import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tsest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		try {
			reader = new FileReader("/home/changke/1.txt");
			char a = (char)reader.read();
			char c2 = (char)reader.read() ;
			System.out.println(""+a+c2);
			//子类放前面,父类放后面
		}catch(FileNotFoundException e){
			e.printStackTrace();
			//父类
		}catch(IOException e) {
			e.printStackTrace();
		}//关闭资源
		finally {
			try {
				if(reader!=null)
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
//try, catch ,finally,return 
//执行try,catch语句,给返回值赋值,执行finally,
//finally里面不加return,会覆盖try catch里面的返回的值

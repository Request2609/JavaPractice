import java.io.File;
import java.io.IOException;

//file文件或者目录的抽象
public class FILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Practice/src/FILE.java");
		File f2 = new File("/home/changke/java_practice/Practice/src");
		File f3 = new File(f2,"Test5.java");
		File f4 = new File(f2,"Test6.java");
		f4.delete();
	}

}

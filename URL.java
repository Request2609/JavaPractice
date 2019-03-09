package JavaPractice;

public class URL {
	public static void main(String[] args) {
		URL url = new URL("http://www.baidu.com:80/index.html");
		url = new URL(url,"/index.html");
	}
}	

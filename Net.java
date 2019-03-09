package JavaPractice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net {
	public static void main(String[]args) throws UnknownHostException {
		
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress()) ;
		System.out.println(addr.getHostName());
		addr = InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());
		addr = InetAddress.getByName("King");
		System.out.println(addr.getHostAddress());	
	}
}

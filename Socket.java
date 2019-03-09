package JavaPractice;

import java.net.InetAddress;
import java.net.InetSocketAddress;

//创建对象:InetSocketAddress封装端口

public class Socket {
	public static void main(String[]args) {
		InetSocketAddress address  = new InetSocketAddress("127.0.0.1",9999);
		System.out.println(address.getPort());
		System.out.println(address.getHostName());
		InetAddress addr = address.getAddress();
		System.out.println(addr.getHostAddress());
	}
}

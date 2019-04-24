//建立连接，客户端地址和端口
//操作输入输出流
//操作释放资源

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[]args) throws IOException {

        System.out.println("client") ;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in)) ;

        System.out.print("请输入用户名：");

        String uname = console.readLine() ;

        System.out.print("请输入密码：");
        String passwd = console.readLine() ;
        //建立连接
        Socket cli = new Socket("localhost",9999) ;

        //输入输出流操作
        DataOutputStream ds =new DataOutputStream(cli.getOutputStream());


        ds.writeUTF("uname="+uname+"&"+"passwd="+passwd);

        ds.flush();
        DataInputStream dis = new DataInputStream(cli.getInputStream()) ;
        String result = dis.readUTF() ;

        System.out.println(result) ;
        cli.close();
    }
}

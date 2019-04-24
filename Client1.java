import java.io.*;
import java.net.Socket;

public class Client1 {

    public static void main(String []args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in)) ;
        //接收用户输入
        System.out.print("请输入用户名：");
        String uname = console.readLine() ;
        System.out.print("请输入密码：");
        String psd = console.readLine() ;

        Socket client = new Socket("localhost", 9999);

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String data ="uname="+ uname+"&"+"password="+psd;
        dos.writeUTF(data);
        dos.flush();
        DataInputStream dis = new DataInputStream(client.getInputStream()) ;
        String info = dis.readUTF() ;
        System.out.println(info) ;
        //释放资源
        dos.close();
        client.close();
    }
}

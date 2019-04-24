import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//基于tcp的服务器
//创建服务器，使用serverSocket
//阻塞时等待连接accept
//输入输出操作
//释放资源

public class SocketCoding {

    public static void main(String[]args) throws IOException {
        ServerSocket server = new ServerSocket(9999) ;
        Socket client = server.accept() ;
        System.out.println("一个客户端建立了连接！");
        DataInputStream ds = new DataInputStream(client.getInputStream()) ;

        String data = ds.readUTF() ;
        String uname ="";
        String pass ="";
        String []dataArr=data.split("&") ;
        for(String  info:dataArr)
        {
            String[]user = info.split("=") ;
            System.out.println(user[0]+"---->"+user[1]) ;
            if(user[0].equals("uname")){
                uname = user[1] ;
                System.out.println("用户名："+user[1]) ;
            }
            if(user[0].equals("passwd"))
            {
                pass = user[1] ;
                System.out.println("密码："+user[1]) ;
            }
        }
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        if(uname.equals("changke")&&pass.equals("changke"))
        {
            dos.writeUTF("登陆成功");
        }
        else
        {
            dos.writeUTF("登录失败");
        }
        dos.flush();
        ds.close() ;
        client.close() ;
        server.close() ;
    }
}

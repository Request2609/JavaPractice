import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String []args) throws IOException {

        ServerSocket server = new ServerSocket(9999);
        Socket client = server.accept();
        DataInputStream dis = new DataInputStream(client.getInputStream());

        String datas = dis.readUTF();

        String[] dataArr = datas.split("&");
        String[] user = dataArr[0].split("=");
        String[] psd = dataArr[1].split("=");
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        if (user[1].equals("zs") && psd.equals("zs")) {
            dos.writeUTF("登陆成功");
        } else {
            dos.writeUTF("登录失败");
        }

        dos.flush();
        dis.close();
        dos.close();
        server.close() ;
    }
 }

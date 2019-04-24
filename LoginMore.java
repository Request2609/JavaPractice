import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginMore {
    public static void main(String []args) throws IOException {
        ServerSocket server = new ServerSocket(9999) ;

        boolean running = true ;
        while(running)
        {
            Socket client = server.accept() ;
            new Thread(new Channel(client)).start();
        }
        server.close() ;
    }
    static class Channel implements Runnable {

        private Socket client=null ;
        private DataInputStream dis ;
        private DataOutputStream dos ;

        public Channel(Socket client) throws IOException {
            this.client = client ;
            dis = new DataInputStream(client.getInputStream()) ;
            dos = new DataOutputStream(client.getOutputStream());
        }

        public String recieve() throws IOException {

            String datas = dis.readUTF() ;

            return datas;
        }


        public void send(String s) throws IOException {

            dos.writeUTF(s);
            dos.flush();
            dos.close();
        }

        public void run()
        {
            String datas =null;
            System.out.println("一个客户端建立连接");
            try {
                 datas = recieve();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String user=null,psd =null;

            String []data =datas.split("&") ;
            for(String info:data)
            {
                String[]tmp = info.split("=") ;
                if(tmp[0].equals("uname"))
                {
                    user = tmp[1] ;
                }
                if(tmp[0].equals("password"))
                {
                    psd = tmp[1] ;
                }
            }
            System.out.println("用户名为"+user+"------"+"密码"+psd) ;
            if(user.equals("zs")&&psd.equals("zs"))
                try {
                    send("登陆成功");
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        release();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            else
            {
                try {
                    send("添加失败");
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        release() ;
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }

        }
        public void release() throws IOException {

            client.close() ;
        }
    }
}


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String []aegs) throws IOException {
        ServerSocket server = new ServerSocket(9999) ;
        Socket client = server.accept() ;
        InputStream is = new BufferedInputStream(client.getInputStream()) ;
        OutputStream os = new BufferedOutputStream(new FileOutputStream("src/tcp.mp4"));
        byte[] flush = new byte[1024] ;
        int len = -1 ;
        while((len = is.read(flush)) != -1)
        {
            os.write(flush, 0, len);
        }
        os.flush() ;
        os.close() ;
        is.close() ;
    }
}

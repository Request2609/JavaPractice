import java.io.*;
import java.net.Socket;

public class FileSend {

    public static void main(String []args) throws IOException {
        Socket client = new Socket("localhost",9999);

        InputStream is = new BufferedInputStream(new FileInputStream("/home/changke/视频/录屏.mp4"));
        OutputStream os = new BufferedOutputStream(client.getOutputStream()) ;

        byte[] flush = new byte[1024] ;
        int len = -1 ;
        while((len = is.read(flush)) != -1){
            os.write(flush,0,len) ;
        }
        is.close() ;
        os.flush() ;
        client.close() ;
    }
}

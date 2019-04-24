import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient {
    public static void main(String[]args) throws IOException {
        Socket client = new Socket("localhost", 9999);
        BufferedReader colsole = new BufferedReader(new InputStreamReader(System.in)) ;
    }
}

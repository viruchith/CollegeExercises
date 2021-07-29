
/**
 * TimeClient
 */
import java.net.*;
import java.io.*;

public class TimeClient {

    public static void main(String[] args) {
        final String host = "localhost";
        final int port = 5000;

        try {
            Socket s = new Socket(host, port);
            DataInputStream din = new DataInputStream(s.getInputStream());

            String msg = din.readUTF();

            System.out.println(msg);

            s.close();
            
            din.close();

        } catch (UnknownHostException e) {
            System.out.println("Error resolving host !!!");
        } catch (IOException e) {
            System.out.println("Error establishing connection");
        }

    }
}

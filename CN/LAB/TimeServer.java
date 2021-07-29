/**
 * TimeServer
 */

 import java.net.*;
 import java.io.*;
 import java.util.Date;

public class TimeServer {

    public static void main(String[] args) {
        final int port = 5000;
        try {
            ServerSocket ss = new ServerSocket(port);
            
            Socket s = ss.accept();

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            String date = new Date().toString();
            dout.writeUTF(date);
            dout.flush();
            dout.close();;
            s.close();
            ss.close();

        } catch (IOException e) {
            System.out.println("Error creating socket !!!");
        }
    }
}

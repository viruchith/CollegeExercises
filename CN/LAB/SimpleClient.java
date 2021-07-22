import java.io.*;
import java.net.*;

public class SimpleClient {
  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try {
      Socket s = new Socket("localhost", 5000);
      DataOutputStream dout = new DataOutputStream(s.getOutputStream());
      String inp = "";
      while (s.isConnected() && inp.equals("exit") == false) {
        System.out.print("Enter : ");
        inp = br.readLine();
        dout.writeUTF(inp);
      }
      System.out.println("Exiting Client .....");
      dout.writeUTF("quit");
      dout.flush();
      dout.close();
      s.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

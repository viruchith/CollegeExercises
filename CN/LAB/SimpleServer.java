import java.io.*;
import java.net.*;
class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(5000);
      Socket s = ss.accept(); //establishes connection   
      String msgFrmClient = "";
      while (s.isConnected() && msgFrmClient.equals("quit") == false) {
        DataInputStream dis = new DataInputStream(s.getInputStream());
        msgFrmClient = (String) dis.readUTF();
        System.out.println("Client: " + msgFrmClient);
      }
      System.out.println("Quitting Server.....");
      ss.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

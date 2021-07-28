import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpSender {
    public static void main(String[] args) {
        final int port = 5000;
        final String host = "localhost"; // aka '127.0.0.1'
        String userInp = "";

        Scanner sc = new Scanner(System.in);

        try {
            InetAddress address = InetAddress.getByName(host);
            DatagramSocket ds = new DatagramSocket();
            while (!userInp.equals("exit")) {
                System.out.print("Enter  :  ");
                userInp = sc.nextLine();
                DatagramPacket dp = new DatagramPacket(userInp.getBytes(), userInp.length(), address, port);
                ds.send(dp);
            }
            System.out.println("Quitting sender...");
            ds.close();
            sc.close();
        } catch (UnknownHostException e) {
            System.out.println("Error Resolving hostname !!!");
        } catch (SocketException e) {
            System.out.println("Error esstablishing connection !!!");
        } catch (IOException e) {
            System.out.println("Error sending data !!!");
        }
    }
}

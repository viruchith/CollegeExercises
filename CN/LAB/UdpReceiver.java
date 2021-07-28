import java.io.IOException;
import java.net.*;
/**
 * UdpReceiver
 */
public class UdpReceiver {
    public static void main(String[] args) {
        final int port = 5000;
        final int MAX_LENGTH = 1000;
        final String host = "localhost" , EXIT_PHRASE = "exit";
        String incoming_data="";

        try {
            InetAddress address = InetAddress.getByName(host);

            DatagramSocket ds = new DatagramSocket(port,address);

            while (!incoming_data.equals("exit")) {
                byte[] data = new byte[MAX_LENGTH];
                DatagramPacket dp = new DatagramPacket(data,MAX_LENGTH);
                ds.receive(dp);
                incoming_data = new String(dp.getData());
                System.out.println("client : "+incoming_data+" <END>");
            }
            System.out.println("Quitting Receiver.....");
            ds.disconnect();
            ds.close();

        } catch (SocketException e) {
            System.out.println("Error establishing connection !!!");
        }catch(UnknownHostException e){
            System.out.println("Error resolving host !!!");
        }catch(IOException e){
            System.out.println("Error parsing data !!!");
        }
    }
    
}

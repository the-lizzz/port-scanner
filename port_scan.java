import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class port_scan {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HOST_ADDRESS>");
        String host = scanner.nextLine();
        InetAddress inet = InetAddress.getByName(host);
        String h = inet.getHostName();
        System.out.println("OPEN PORTS");
        for (int port = 0; port <= 65535; port++) {
            try{
                Socket socket = new Socket(h, port);
                String text = "[+]PORT: "+port+" is open";
                System.out.println(text);
                socket.close();
            } 
            catch (IOException e){
               
            }
        }
    }
}

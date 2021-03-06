import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketMethods {

    public static  void main(String[] args) {
        Socket s;
        s = new Socket();
        try {
            s = new Socket("www.openclassrooms.com", 0b1010000);
            System.out.println("Port de communication côté serveur : " + s.getPort());
            System.out.println("Port de communication côté client : " + s.getLocalPort());
            System.out.println("Nom de l'hôte distant : " + s.getInetAddress().getHostName());
            System.out.println("Adresse de l'hôte distant : " + s.getInetAddress().getHostAddress());
            System.out.println("Adresse socket de l'hôte distant : " + s.getRemoteSocketAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    s = null;
                }
            }
        }
    }}

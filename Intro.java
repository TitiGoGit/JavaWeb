import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Intro {

    public static  void main(String[] args) {
        Socket s;
        s = new Socket();
        try {


            System.out.println("Port de communication côté client : " + s.getLocalPort());
            System.out.printf("adresse ip local : %s%n", s.getInetAddress().getLocalHost());

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
  

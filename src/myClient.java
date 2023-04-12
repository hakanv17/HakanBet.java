import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;


public class myClient {
    public static void main(String[] args) {
        try {
            Socket myClient = new Socket("localhost", 3000);
            InputStream inputStream = myClient.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
            myClient.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

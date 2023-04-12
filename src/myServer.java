import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("Waiting for Client");
            Socket socket = serverSocket.accept();
            System.out.println("Client found");
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            LoginPage loginPage = new LoginPage();
            objectOutputStream.writeObject(loginPage);
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

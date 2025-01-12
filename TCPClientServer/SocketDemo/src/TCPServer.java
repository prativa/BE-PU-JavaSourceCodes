import java.io.*;
import java.net.*;

public class TCPServer {
    
    public static void main(String[] args) {
        final int PORT = 1234;

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected...");

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            // Receive the string from the client
            String receivedString = in.readUTF();
            System.out.println("Received from client: " + receivedString);

            // Echo back the received string in uppercase
            String upperCaseString = receivedString.toUpperCase();
            out.writeUTF(upperCaseString);

            clientSocket.close();
            serverSocket.close(); // Close the server socket after processing one client
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

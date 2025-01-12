import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("locahost", 1234);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to send to the server: ");
            String message = scanner.nextLine();
            // Send the string to the server
            out.writeUTF(message);

            // Receive and print the response from the server
            String response = in.readUTF();
            System.out.println("Server response: " + response);

            scanner.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

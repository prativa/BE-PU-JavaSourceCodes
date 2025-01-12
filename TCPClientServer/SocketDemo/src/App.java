import java.io.*;
import java.net.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Socket clientSocket = new Socket("localHost" ,6666);
        OutputStream outputStream = clientSocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("Hello!");
        dataOutputStream.flush();
        dataOutputStream.close();
        clientSocket.close();


        InputStream inputStream = clientSocket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String stringFromInputStream = (String) dataInputStream.readUTF();

        
    }
}

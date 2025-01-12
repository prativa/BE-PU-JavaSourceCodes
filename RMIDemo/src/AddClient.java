
/**
 * We are building a simple client/server application by using RMI
 * The server receives a request from a client, processes it and returns a result.
 * In this example, the request specifies two numbers
 * The server adds these together and returns the sum.
 * This application has four main components:
 * 1. SumInterface - remote interface provided by the server.
 * 2. AddServerImpl.java - implements the remote interface
 * 3. AddServer.java containts the main program from the servermachine
 * 4. AddClient.java implements the client side of the distribute system
 */

import java.rmi.Naming;

/**AddClient.java requires three comman-line argument
  * First: IP address or name of the server machine
  * Second, Third : Two numbers that are to be summed
  */
public class AddClient {

    public static void main(String[] args) throws Exception {
        try {
            String addServerUrl ="rmi://localhost:1024/AddServer";
            SumInterface sumInterface = (SumInterface) Naming.lookup(addServerUrl);

            int firstNumber = 5;
            int secondNumber = 7;

            int sum = sumInterface.getSum(5, 7);
            System.out.print("The sum is "+sum);


            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

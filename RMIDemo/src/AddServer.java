import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * AddServer contains the main program for the server machine.
 * Its primary function is to update the RMI registry on that machine.
 * This is done by using the rebind() method of the Naming class(found in java.rmi)
 * That method associates a name with an object reference.
 */
public class AddServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1024);
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("//localhost:1024/AddServer", addServerImpl);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("This is an exception");
        }
        
    }

}

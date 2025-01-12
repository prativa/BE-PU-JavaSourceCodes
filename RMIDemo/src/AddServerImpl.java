import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * AddServerImpl implements the remote interface.
 * Implementation of add method is straightforward.
 * Remote objects typically extend UnicastRemoteObject which provides 
 * functionality that is needed
 * to make objects available from remote machines.
 */
public class AddServerImpl extends UnicastRemoteObject implements SumInterface {

    public AddServerImpl() throws RemoteException{
       // super();
    }

    @Override
    public int getSum(int firstNumber, int secondNumber) throws RemoteException {
        return firstNumber+secondNumber;
    }

}

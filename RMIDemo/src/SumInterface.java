import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * All remote interfaces must extend the Remote interface,
 *  which is part of java.rmi
 * Remote difines no members
 * Its purpose is simply to indicate an interface uses remote methods
 * All remote methods can throw a RemoteException
 */
public interface SumInterface extends Remote {
    public int getSum(int firstNumber, int secondNumber) throws RemoteException;

}

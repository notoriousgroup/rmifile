import java.rmi.*;
public interface fileinterface extends Remote
{
 public byte[] downloadfile(String s) throws RemoteException;
} 
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthService extends Remote {
    public boolean Authothification(String a, String b) throws RemoteException;
}

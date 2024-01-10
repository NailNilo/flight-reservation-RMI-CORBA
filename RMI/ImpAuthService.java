import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ImpAuthService extends UnicastRemoteObject implements AuthService {

    private Map<String, String> adminCredentials;
    private Map<String, String> clientCredentials;
    
    protected ImpAuthService() throws RemoteException {
        super();
        adminCredentials = new HashMap<>();
        clientCredentials = new HashMap<>();

        adminCredentials.put("admin", "admin");
        clientCredentials.put("client", "client");
    }

    @Override
    public boolean Authothification(String username, String password) throws RemoteException {
        if (adminCredentials.containsKey(username)) {
            return adminCredentials.get(username).equals(password);
        } else if (clientCredentials.containsKey(username)) {
            return clientCredentials.get(username).equals(password);
        } else {
            return false;
        }
    }
}

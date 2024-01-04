import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationServiceImpl extends UnicastRemoteObject implements AuthenticationService {

    // Store username-password pairs for admin and client
    private Map<String, String> adminCredentials;
    private Map<String, String> clientCredentials;
    
    protected AuthenticationServiceImpl() throws RemoteException {
        super();
        adminCredentials = new HashMap<>();
        clientCredentials = new HashMap<>();

        // Initialize credentials (replace these with actual values)
        adminCredentials.put("admin", "admin");
        clientCredentials.put("client", "client");
    }

    @Override
    public boolean authenticate(String username, String password) throws RemoteException {
        // Check if the provided username exists
        if (adminCredentials.containsKey(username)) {
            // Check if the provided password matches the stored password for the admin
            return adminCredentials.get(username).equals(password);
        } else if (clientCredentials.containsKey(username)) {
            // Check if the provided password matches the stored password for the client
            return clientCredentials.get(username).equals(password);
        } else {
            // Username not found
            return false;
        }
    }
}

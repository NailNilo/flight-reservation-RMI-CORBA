import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	// it's server, not serveur :D
	public static void main(String[] args) throws Exception {
		try{
		LocateRegistry.createRegistry(6942);
		AuthService srv = new ImpAuthService();
		AdminService srv1 = new ImpAdminService();
		ClientService srv2 = new ImpClientService();
		Naming.rebind("rmi://localhost:6942/AuthService", srv);
		Naming.rebind("rmi://localhost:6942/AdminService", srv1);
		Naming.rebind("rmi://localhost:6942/ClientService", srv2);
		System.out.println("Server Ready & Running...");
			
	}catch(Exception e){
		e.printStackTrace();
	}
}
}

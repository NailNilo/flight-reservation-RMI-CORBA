import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientService extends Remote {
    void registerNewPassenger(String passengerName, String phonenumber,String address,String email,String passport,String seattype) throws RemoteException;
    void viewAllFlights() throws RemoteException;
    void availableseats() throws RemoteException;
    void payment(double pay) throws RemoteException;
}

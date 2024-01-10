import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AdminService extends Remote {
    void addNewFlight(String code, String departureAirport, String arrivalAirport, String departureTime, String arrivalTime, double price) throws RemoteException;
    void addNewAirport(String code, String city) throws RemoteException;
    void registerNewPassenger(String passengerName, String phonenumber,String address,String email,String passport,String seattype) throws RemoteException;
    void viewAllFlights() throws RemoteException;
    void editFlight() throws RemoteException;
    void editAirport() throws RemoteException;
}

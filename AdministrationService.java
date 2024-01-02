import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AdministrationService extends Remote {
    void addFlight(Flight flight) throws RemoteException;
    void removeFlight(String flightId) throws RemoteException;
    void addAirport(Airport airport) throws RemoteException;
    void removeAirport(String airportId) throws RemoteException;
}

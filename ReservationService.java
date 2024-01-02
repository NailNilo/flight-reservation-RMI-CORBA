import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ReservationService extends Remote {
    List<Flight> consultFlights() throws RemoteException;
    List<Fare> consultFares(String flightId) throws RemoteException;
    Reservation makeReservation(String flightId, String passengerName) throws RemoteException;
    void updatePassengerInfo(String passengerName, PassengerInfo info) throws RemoteException;
    void reserveFlight(Agent agent, Passenger passenger, Flight flight, String string) throws RemoteException;
    String reserveFlight(String passengerCode, String flightCode, String seatNumber, Reservation.ReservationType reservationType, boolean isConfirmed) throws RemoteException;
}

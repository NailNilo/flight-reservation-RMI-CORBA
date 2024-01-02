import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl extends UnicastRemoteObject implements ReservationService {
    private List<Reservation> reservations;
    private List<Fare> fareList;

    protected ReservationServiceImpl() throws RemoteException {
        super();
        this.reservations = new ArrayList<>();

        fareList = new ArrayList<>();
        fareList.add(new Fare("F1", 200.0));
        fareList.add(new Fare("F2", 150.0));
        fareList.add(new Fare("F3", 180.0));
    }

    @Override
    public String reserveFlight(String passengerCode, String flightCode, String seatNumber, Reservation.ReservationType reservationType, boolean isConfirmed) throws RemoteException {
        // Create a new Reservation and add it to the list of reservations
        Reservation reservation = new Reservation(passengerCode, flightCode, seatNumber, reservationType, isConfirmed);
        reservations.add(reservation);

        // Return a confirmation message
        return "Flight reserved for passenger " + passengerCode + " on flight " + flightCode;
    }

    @Override
    public List<Flight> consultFlights() throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultFlights'");
    }

    @Override
    public List<Fare> consultFares(String flightId) throws RemoteException {
        List<Fare> matchingFares = new ArrayList<>();

        // Iterate through the in-memory fareList to find matching fares
        for (Fare fare : fareList) {
            if (fare.getFlightId().equals(flightId)) {
                matchingFares.add(fare);
            }
        }

        return matchingFares;
    }

    @Override
    public Reservation makeReservation(String flightId, String passengerName) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeReservation'");
    }

    @Override
    public void updatePassengerInfo(String passengerName, PassengerInfo info) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePassengerInfo'");
    }

    @Override
    public void reserveFlight(Agent agent, Passenger passenger, Flight flight, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reserveFlight'");
    }
}
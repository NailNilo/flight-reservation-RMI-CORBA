import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl extends UnicastRemoteObject implements ReservationService {
    private List<Reservation> reservations;
    private List<Flight> flightList;
    private List<Fare> fareList;
    private List<Reservation> reservationList;

    protected ReservationServiceImpl() throws RemoteException {
        super();
        this.reservations = new ArrayList<>();

        // Initialize flightList (assuming you have some initial data)
        flightList = new ArrayList<>();
        flightList.add(new Flight("69420", "Flight 1", null, null, null));
        flightList.add(new Flight("54654", "Flight 2", null, null, null));
        flightList.add(new Flight("86784", "Flight 3", null, null, null));

        fareList = new ArrayList<>();
        fareList.add(new Fare("F1", 200.0));
        fareList.add(new Fare("F2", 150.0));
        fareList.add(new Fare("F3", 180.0));

        reservationList = new ArrayList<>();
    }

    //DONE. This method is used to reserve a flight
    @Override
    public String reserveFlight(String passengerCode, String flightCode, String seatNumber, Reservation.ReservationType reservationType, boolean isConfirmed) throws RemoteException {
        // Create a new Reservation and add it to the list of reservations
        Reservation reservation = new Reservation(passengerCode, flightCode, seatNumber, reservationType, isConfirmed);
        reservations.add(reservation);

        // Return a confirmation message
        return "Flight reserved for passenger " + passengerCode + " on flight " + flightCode;
    }

    //DONE. This method is used to cancel a reservation
    @Override
    public List<Flight> consultFlights() throws RemoteException {
        // Since we're using in-memory data, we can simply return the list
        return flightList;
    }

    //DONE. This method is used to consult the fares of a flight
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

    //DONE. This method is used to make a reservation
    @Override
    public Reservation makeReservation(String flightId,String passengerName) throws RemoteException {
        // TODO Auto-generated method stub
        Reservation reservation = new Reservation(passengerName, flightId, "1A", Reservation.ReservationType.ECONOMY, true);
        reservationList.add(reservation);

        return reservation;
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
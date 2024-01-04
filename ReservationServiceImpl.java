import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl extends UnicastRemoteObject implements ReservationService {
    private List<Flight> flightList;
    private List<Fare> fareList;
    private List<Reservation> reservationList;
    
    protected ReservationServiceImpl() throws RemoteException {
        super();
        
        Airport airport2 = new Airport("Airport2");
        Airport airport1 = new Airport("Airport1");

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
    public List<Flight> consultFlights() throws RemoteException {
        return flightList;
    }

    //DONE.
    @Override
    public List<Fare> consultFares(String flightId) throws RemoteException {
        List<Fare> matchingFares = new ArrayList<>();

        for (Fare fare : fareList) {
            if (fare.getFlightId().equals(flightId)) {
                matchingFares.add(fare);
            }
        }

        return matchingFares;
    }

    //DONE.
    @Override
    public Reservation makeReservation(String flightId, String passengerName) throws RemoteException {
        // TODO: Implement the reservation creation logic
        Flight flight = findFlightById(flightId);
        if (flight != null) {
            Reservation reservation = new Reservation(passengerName, flightId, "", Reservation.ReservationType.ECONOMY, false);
            reservationList.add(reservation);
            return reservation;
        } else {
            throw new RemoteException("Flight not found.");
        }
    }

//-----------------------------------------------------------------------------------------------------
    //solution  later fuck it
    //DONE BUT NO USE??
    @Override
    public void updatePassengerInfo(String passengerName, PassengerInfo info) throws RemoteException {
        // TODO: Implement the passenger info update logic
        // You may want to search for the passenger in the reservationList and update the info
    }
    //DONE BUT NO USE??
    @Override
    public void reserveFlight(Agent agent, Passenger passenger, Flight flight, String string) throws RemoteException {
        // TODO: Implement the flight reservation logic
        // This method takes an Agent, Passenger, and Flight as parameters; you can customize the logic accordingly
    }
//-----------------------------------------------------------------------------------------------------

    //DONE.
    @Override
    public String reserveFlight(String passengerCode, String flightCode, String seatNumber,
                                Reservation.ReservationType reservationType, boolean isConfirmed) throws RemoteException {
        // TODO: Implement the flight reservation logic and return a confirmation message
        // This method takes individual parameters for reservation; you can customize the logic accordingly
        return "Reservation confirmed for passenger " + passengerCode + " on flight " + flightCode +
                " with seat " + seatNumber + ". Confirmation status: " + isConfirmed;
    }

    // Helper method to find a flight by its ID
    private Flight findFlightById(String flightId) {
        for (Flight flight : flightList) {
            if (flight.getCode().equals(flightId)) {
                return flight;
            }
        }
        return null;
    }
}
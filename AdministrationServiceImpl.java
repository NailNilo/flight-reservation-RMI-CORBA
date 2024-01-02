import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdministrationServiceImpl extends UnicastRemoteObject implements AdministrationService {

    private List<Flight> flights;
    private List<Airport> airports;

    protected AdministrationServiceImpl() throws RemoteException {
        super();
        flights = new ArrayList<>();
        airports = new ArrayList<>();
    }
    //Done.
    @Override
    public void addFlight(Flight flight) throws RemoteException {
        flights.add(flight);
        System.out.println("Flight added: " + flight.getCode());
    }
    //Done.
    @Override
    public void removeFlight(String flightId) throws RemoteException {
        Iterator<Flight> iterator = flights.iterator();
        while (iterator.hasNext()) {
            Flight flight = iterator.next();
            if (flight.getCode().equals(flightId)) {
                iterator.remove();
                System.out.println("Flight removed: " + flight.getCode());
                return;
            }
        }
        System.out.println("Flight with ID " + flightId + " not found.");
    }
    //Done.
    @Override
    public void addAirport(Airport airport) throws RemoteException {
        airports.add(airport);
        System.out.println("Airport added: " + airport.getCode());
    }
    //Done.
    @Override
    public void removeAirport(String airportId) throws RemoteException {
        Iterator<Airport> iterator = airports.iterator();
        while (iterator.hasNext()) {
            Airport airport = iterator.next();
            if (airport.getCode().equals(airportId)) {
                iterator.remove();
                System.out.println("Airport removed: " + airport.getCode());
                return;
            }
        }
        System.out.println("Airport with ID " + airportId + " not found.");
    }
}

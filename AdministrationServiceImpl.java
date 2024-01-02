import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdministrationServiceImpl extends UnicastRemoteObject implements AdministrationService {

    protected AdministrationServiceImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public void addFlight(Flight flight) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFlight'");
    }
    // implement the methods

    @Override
    public void removeFlight(String flightId) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFlight'");
    }

    @Override
    public void addAirport(Airport airport) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAirport'");
    }

    @Override
    public void removeAirport(String airportId) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAirport'");
    }
}
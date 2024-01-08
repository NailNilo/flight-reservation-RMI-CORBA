import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpAdminService extends UnicastRemoteObject implements AdminService {
    
    protected ImpAdminService() throws RemoteException {
        super();
    }

    @Override
    public void addNewFlight(String code, String departureAirport, String arrivalAirport, String departureTime,
        String arrivalTime, double price) throws RemoteException {
        System.out.println("New Flight Added:");
        System.out.println("Flight Number: " + code);
        System.out.println("Departure Airport: " + departureAirport);
        System.out.println("Arrival Airport: " + arrivalAirport);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Price: " + price);
        System.out.println();
}

    @Override
    public void addNewAirport(String code, String city) throws RemoteException {
        System.out.println("New Airport Added:");
        System.out.println("Airport Code: " + code);
        System.out.println("City: " + city);
       // System.out.println("Is Paid: " + isPaid);
       System.out.println();
    }

    @Override
    public void registerNewPassenger(String passengerName, String phonenumber,String address,String email,String passport,String seattype) throws RemoteException {
        System.out.println("New Passenger Booked:");
        System.out.println("Passenger Full Name: " + passengerName);
        System.out.println("Passenger Phone Number: " + phonenumber);
        System.out.println("Passenger Address: " + address);
        System.out.println("Passenger Email: " + email);
        System.out.println("Passenger Passport ID: " + passport);
        System.out.println("Passenger Seat Type: " + seattype);
        System.out.println();
    }

    @Override
    public void viewAllFlights() throws RemoteException {
            System.out.println("All Flights:");
            System.out.println("___________________________________________________________________________________"); 
            System.out.println("|Flight Number|Departure Airport|Arrival Airport|Departure Time|Arrival Time|Price|");
            System.out.println("|_____________|_________________|_______________|______________|____________|_____|"); 
            System.out.println("|   00026     |     London      |    Boston     |    18:00     |    1:30    | 150$|");
            System.out.println("|   00055     |     Berlin      |    Sydney     |    13:00     |    12:00   | 350$|");
            System.out.println("|   00069     |     Madrid      |    Cologne    |    04:20     |    6:09    | 69$ |");
            System.out.println("|   00089     |     Krakow      |    Frankfurt  |    10:40     |    11:15   | 50$ |");
            System.out.println("|   00145     |     Tokyo       |    Seoul      |    12:15     |    2:30    | 80$ |");
            System.out.println("|_____________|_________________|_______________|______________|____________|_____|"); 
    }

    @Override
    public void editFlight() throws RemoteException {
        System.out.println("Flight Edited:");
        System.out.println("DataBase is Under Maintenance, Please Try Again Later.");
    }

    @Override
    public void editAirport() throws RemoteException {
        System.out.println("Airport Edited:");
        System.out.println("DataBase is Under Maintenance, Please Try Again Later.");
    }
}

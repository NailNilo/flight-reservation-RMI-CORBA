import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void reserveFlight(Passenger passenger, Flight flight, String seatNumber) {
        lock.lock();
        try {
            // Add logic to reserve the flight for the passenger.
            // This could involve creating a new Reservation object and adding it to a list of reservations.
            System.out.println("Flight reserved for passenger " + passenger.getName());
        } finally {
            lock.unlock();
        }
    }

    public void reserveFlight(Agent agent, Passenger passenger, Flight flight, String seatNumber) {
        if (agent.isAuthenticated()) {
            lock.lock();
            try {
                // Add logic to reserve the flight for the passenger.
                // This could involve creating a new Reservation object and adding it to a list of reservations.
                System.out.println("Flight reserved for passenger " + passenger.getName() + " by agent " + agent.getId());
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Agent is not authenticated.");
        }
    }
}
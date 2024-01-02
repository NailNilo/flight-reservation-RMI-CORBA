import javax.swing.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Flight Reservation Server");
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            frame.add(new JScrollPane(textArea));
            frame.setSize(500, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            try {
                // Initialize the RMI server
                AdministrationServiceImpl adminService = new AdministrationServiceImpl();
                ReservationServiceImpl reservationService = new ReservationServiceImpl();
                AuthenticationServiceImpl authService = new AuthenticationServiceImpl();

                Registry registry = LocateRegistry.createRegistry(6942);
                registry.bind("AdministrationService", adminService);
                registry.bind("ReservationService", reservationService);
                registry.bind("AuthenticationService", authService);

                textArea.append("Server is ready.\n");
            } catch (Exception e) {
                textArea.append("Server exception: " + e.toString() + "\n");
                e.printStackTrace();
            }
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Flight Reservation Client");
            frame.setLayout(new BorderLayout());

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new GridLayout(0, 2));

            JTextField usernameField = new JTextField();
            inputPanel.add(new JLabel("Username:"));
            inputPanel.add(usernameField);

            JTextField passwordField = new JTextField();
            inputPanel.add(new JLabel("Password:"));
            inputPanel.add(passwordField);

            JButton authenticateButton = new JButton("Authenticate");
            inputPanel.add(authenticateButton);

            frame.add(inputPanel, BorderLayout.NORTH);

            frame.setSize(500, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            authenticateButton.addActionListener(e -> {
                try {
                    // Connect to the RMI server
                    Registry registry = LocateRegistry.getRegistry("localhost", 1099);

                    AuthenticationService authService = (AuthenticationService) registry.lookup("AuthenticationService");
                    if (authService.authenticate(usernameField.getText(), passwordField.getText())) {
                        textArea.append("Authenticated.\n");

                        // Add more code here to interact with the RMI server
                        ReservationService reservationService = (ReservationService) registry.lookup("ReservationService");
                        List<Flight> flights = reservationService.consultFlights();
                        textArea.append("Available Flights:\n");
                        for (Flight flight : flights) {
                            textArea.append("Flight Code: " + flight.getCode() + ", Departure: " + flight.getDepartureAirport().getCode() +
                                    ", Arrival: " + flight.getArrivalAirport().getCode() + ", Price: $" + flight.getPrice() + "\n");
                        }
                    } else {
                        textArea.append("Authentication failed.\n");
                    }
                } catch (Exception ex) {
                    textArea.append("Client exception: " + ex.toString() + "\n");
                    ex.printStackTrace();
                }
            });
        });
    }
}

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

public class Flight implements Serializable{
    private String code;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private double price;

    public Flight(String code, Airport departureAirport, Airport arrivalAirport, LocalDate departureDate, LocalDate arrivalDate, LocalTime departureTime, LocalTime arrivalTime, double price) {
        this.code = code;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public Flight(String string, String string2, String string3, String string4, String string5) {
    }

    // Getter for code
    public String getCode() {
        return this.code;
    }

    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for departureAirport
    public Airport getDepartureAirport() {
        return this.departureAirport;
    }

    // Setter for departureAirport
    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    // Getter for arrivalAirport
    public Airport getArrivalAirport() {
        return this.arrivalAirport;
    }

    // Setter for arrivalAirport
    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    // Getter for departureDate
    public LocalDate getDepartureDate() {
        return this.departureDate;
    }

    // Setter for departureDate
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    // Getter for arrivalDate
    public LocalDate getArrivalDate() {
        return this.arrivalDate;
    }

    // Setter for arrivalDate
    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    // Getter for departureTime
    public LocalTime getDepartureTime() {
        return this.departureTime;
    }

    // Setter for departureTime
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    // Getter for arrivalTime
    public LocalTime getArrivalTime() {
        return this.arrivalTime;
    }

    // Setter for arrivalTime
    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}
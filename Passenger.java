import java.time.LocalDate;
import java.io.Serializable;

public class Passenger implements Serializable{
    private String name;
    private String firstName;
    private LocalDate dateOfBirth;
    private String passportNumber;
    private String phoneNumber;
    private String address;
    private String seatNumber;

    public Passenger(String name, String firstName, LocalDate dateOfBirth, String passportNumber, String phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.passportNumber = passportNumber;
        this.phoneNumber = phoneNumber;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for dateOfBirth
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    // Setter for dateOfBirth
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Getter for passportNumber
    public String getPassportNumber() {
        return this.passportNumber;
    }

    // Setter for passportNumber
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Getter for phoneNumber
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Setter for phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for seatNumber
    public String getSeatNumber() {
        return this.seatNumber;
    }

    // Setter for seatNumber
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
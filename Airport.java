public class Airport {
    private String code;
    private String city;
    private boolean isPaid;

    public Airport(String code, String city, boolean isPaid) {
        this.code = code;
        this.city = city;
        this.isPaid = isPaid;
    }

    // Getter for code
    public String getCode() {
        return this.code;
    }

    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for city
    public String getCity() {
        return this.city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for isPaid
    public boolean getIsPaid() {
        return this.isPaid;
    }

    // Setter for isPaid
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}

public class Fare {
    private String flightId;
    private double price;

    public Fare(String flightId, double price) {
        this.flightId = flightId;
        this.price = price;
    }
    public String getFlightId() {
        return this.flightId;
    }
    public double getPrice() {
        return this.price;
    }
}

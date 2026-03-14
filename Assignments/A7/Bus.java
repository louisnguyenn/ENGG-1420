public class Bus extends Ticket {
    public Bus(String source, String destination, String departureTime) {
        super(source, destination, departureTime);
        setPrice(25.00);
        setCapacity(50);
        setMarker(marker());
    }

    @Override
    public String marker() {
        return "Bus" + super.marker();
    }
}

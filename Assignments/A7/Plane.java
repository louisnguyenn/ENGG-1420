public class Plane extends Ticket {
    public Plane(String source, String destination, String departureTime) {
        super(source, destination, departureTime);
        setPrice(50.00);
        setCapacity(150);
        setMarker(marker());
    }

    @Override
    public String marker() {
        return "Plane" + super.marker();
    }
}

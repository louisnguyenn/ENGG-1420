public class Train extends Ticket {
    public Train(String source, String destination, String departureTime) {
        super(source, destination, departureTime);
        setPrice(10.00);
        setCapacity(400);
        setMarker(marker());
    }

    @Override
    public String marker() {
        return "Train" + super.marker();
    }
}

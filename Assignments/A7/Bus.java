public class Bus extends Ticket {
    private String source;
    private String destination;
    private String departureTime;

    public Bus() {
    }

    public Bus(String source, String destination, String departureTime) {
        setSource(source);
        setDestination(destination);
        setDepartureTime(departureTime);
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String marker() {
        return "Bus" + super.marker();
    }
}

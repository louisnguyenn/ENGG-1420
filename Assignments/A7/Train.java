public class Train extends Ticket {
    private String source;
    private String destination;
    private String departureTime;

    public Train() {
    }

    public Train(String source, String destination, String departureTime) {
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
        return "Train" + super.marker();
    }
}

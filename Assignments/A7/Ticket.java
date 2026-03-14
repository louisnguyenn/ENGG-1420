import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ticket {
    private String source;
    private String destination;
    private String departureTime;
    private double price;
    private String marker;
    private int capacity;
    private static int ticketCount;
    private static ArrayList<Ticket> ticketList = new ArrayList<>();
    private Person person;
    private double discount;
    private double totalCost;
    private int passengerCount;
    private int numTickets;

    public Ticket(String source, String destination, String departureTime) {
        setSource(source);
        setDestination(destination);
        setDepartureTime(departureTime);
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
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

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    // getters
    public String getSource() {
        return this.source;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public String getDestination() {
        return this.destination;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscount() {
        return this.discount * 100;
    }

    public Person getPerson() {
        return this.person;
    }

    public String getMarker() {
        return this.marker;
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public int getNumTickets() {
        return this.numTickets;
    }

    // methods
    public void print() {
        System.out.println("Total tickets sold: " + ticketCount);
        System.out.println("------------------------");
        for (Ticket ticket : ticketList) {
            System.out.println("Ticket holder: " + ticket.getPerson().getName() + " " + ticket.getPerson().getLastName());
            System.out.println("Ticket marker: " + ticket.getMarker());
            System.out.println("Source: " + ticket.getSource());
            System.out.println("Destination: " + ticket.getDestination());
            System.out.println("Departure time: " + ticket.getDepartureTime());
            System.out.println("Price per ticket: " + ticket.getPrice());
            System.out.println("Number of tickets purchased: " + ticket.getNumTickets());
            System.out.println("Discount: " + ticket.getDiscount() + "%");
            System.out.println("Total price of all tickets with discount: " + ticket.getTotalCost());
            System.out.println("------------------------");
        }
    }

    public void add(Person person) {
        Ticket newTicket = new Ticket(getSource(), getDestination(), getDepartureTime());
        ticketCount++;

        if (this.numTickets == 0) {
            newTicket.numTickets = 1;
            newTicket.totalCost = this.price;
        } else {
            newTicket.numTickets = this.numTickets;
            newTicket.totalCost = this.totalCost;
        }

        newTicket.setPerson(person);
        newTicket.setPrice(this.price);
//        System.out.println("test totalcost: " +  this.totalCost);
        newTicket.discount = this.discount;
//        System.out.println("numTickets: " + this.numTickets);
        newTicket.marker = ticketCount + this.marker;

        ticketList.add(newTicket);   // add new ticket to the ticket list
    }

    // function arguments: person object, n -> number of tickets
    public void add(Person person, int n) {
        int k = n;
        this.numTickets = 0;

        for (int i = 0; i < n; i++) {
            if (this.passengerCount > this.capacity) {
                System.out.println("Exceeded capacity of vehicle");
                return;
            }

            this.totalCost += this.price;
//            System.out.println("TEST: price " + this.price);

            if (k > 5) {
                this.discount += 0.02;   // apply 2% discount
                k -= 5;
            }

            while (k >= 5) {
                this.discount += 0.01;   // apply 1% discount
                k -= 5;
            }

            this.numTickets++;
        }

        if (this.discount > 0) {
            double applyDiscount = this.totalCost * this.discount;
            this.totalCost -= applyDiscount;
        }

        ticketCount += n - 1;

        add(person);
        this.passengerCount++;
    }

    public String marker() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = LocalDate.now();

        // format and convert the date into a string
        return formatter.format(date);
    }
}

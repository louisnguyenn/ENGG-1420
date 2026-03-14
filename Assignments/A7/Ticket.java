import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ticket {
    private String price;
    private String marker;
    private static int capacity;
    private static int ticketCount;
    private static ArrayList<Ticket> ticketList = new ArrayList<>();
    private Person person;

    public Ticket() {
    }

    public Ticket(String price) {
        this.marker = marker(); // call marker method
        setPrice(price);
    }

    // setters
    public void setPrice(String price) {
        this.price = price;
    }

    public void print() {
        for (Ticket ticket : ticketList) {
            System.out.println(ticketCount + "\n");
            System.out.println(ticket);
        }
    }

    public void add(Person person) {
        this.person = person;
    }

    public void add(Person person, int n) {
        for (int i = 0; i < n; i++) {
            add(person);
        }
    }

    public String marker() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = LocalDate.now();

        // format and convert the date into a string
        return formatter.format(date);
    }
}

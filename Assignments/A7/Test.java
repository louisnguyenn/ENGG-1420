public class Test {
    public static void main(String[] args) {
        // Trains
        Train train1 = new Train("Toronto", "Montreal", "08:00");
        Train train2 = new Train("Vancouver", "Calgary", "09:30");

        // Planes
        Plane plane1 = new Plane("Toronto", "London", "14:00");
        Plane plane2 = new Plane("Montreal", "Paris", "22:00");

        // Regular Buses
        Bus bus1 = new Bus("Toronto", "Ottawa", "07:00");
        Bus bus2 = new Bus("Hamilton", "Toronto", "10:00");

        // VIP Buses
//        VIPBus vip1 = new VIPBus("Toronto", "Niagara", "11:00");
//        VIPBus vip2 = new VIPBus("Ottawa", "Kingston", "13:00");

        Person p1 = new Person("John", "Doe", "12345");
        Person p2 = new Person("Jane", "Smith", "67890");
        Person p3 = new Person("Alice", "Johnson", "11111");
        Person p4 = new Person("Bob", "Williams", "22222");
        Person p5 = new Person("Charlie", "Brown", "33333");
        Person p6 = new Person("Diana", "Prince", "44444");
        Person p7 = new Person("Edward", "Norton", "55555");
        Person p8 = new Person("Fiona", "Green", "66666");

//        train1.add(p1);        // 1 ticket
//        train1.add(p2, 6);     // 6 tickets → triggers discount
//        train1.add(p3, 3);     // 3 tickets
        train1.add(p4, 4);
        train1.add(p5, 14);

        bus1.add(p1, 6);
        bus2.add(p2);
        bus2.add(p3, 4);

        train1.print();
    }
}

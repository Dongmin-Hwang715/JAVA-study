package java_05_심화;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi2 taxi = new Taxi2();
        Bus2 bus = new Bus2();
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus2){
            ((Bus2) vehicle).checkFare();
        }
        vehicle.run();
    }
}

package java_05_기본;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare();  Vehicle에서는 checkFare()가 정의되지 않았음

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}

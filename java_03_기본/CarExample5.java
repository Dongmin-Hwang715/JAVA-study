package java_03_기본;

public class CarExample5 {
    public static void main(String[] args) {
        Car5 myCar = new Car5("Model");
        myCar.setSpeed(10);
        System.out.println(myCar.getSpeed());
        myCar.run();
    }
}

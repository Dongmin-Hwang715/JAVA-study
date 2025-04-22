package java_03_기본;

public class CarExample4 {
    public static void main(String[] args) {
        Car4 myCar = new Car4();
        myCar.setGas(5);

        while (true) {
            if (myCar.isLeftGas()){
                System.out.println("출발합니다.");
                myCar.run();
            } else {
                System.out.println("gas를 주입하세요.");
                break;
            }
        }
    }
}

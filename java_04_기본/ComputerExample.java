package java_04_기본;

public class ComputerExample {
    public static void main(String[] args) {
        Computer pc = new Computer();
        Calculator calc = new Calculator();

        System.out.println(calc.areaCircle(10));
        System.out.println(pc.areaCircle(10));
    }
}

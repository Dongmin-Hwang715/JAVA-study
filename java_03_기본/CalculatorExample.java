package java_03_기본;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();  // Calculator 객체 생성

        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();
    }
}

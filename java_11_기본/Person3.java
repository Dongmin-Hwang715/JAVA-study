package java_11_기본;

public class Person3 {
    public void action(Calculable2 calculable) {
        double result = calculable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}

package java_07_기본;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long old = System.nanoTime();
        int sum = 0;
        for (int i = 0; i <= 1000000; i++) {
            sum += i;
        }
        long now = System.nanoTime();
        System.out.println(sum);
        System.out.println(now - old);
    }
}

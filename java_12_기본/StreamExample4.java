package java_12_기본;

import java.util.stream.IntStream;

public class StreamExample4 {
    public static int sum; // 합계를 구하기 위한 변수
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }
}

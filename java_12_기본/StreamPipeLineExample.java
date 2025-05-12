package java_12_기본;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균 점수: " + avg);
    }
}

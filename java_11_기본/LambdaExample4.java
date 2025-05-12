package java_11_기본;

public class LambdaExample4 {
    public static void main(String[] args) {
        Person3 person = new Person3();

        // 실행문이 두 개 이상인 경우
        person.action((x, y) -> x + y);

        // sum() 메서드를 호출
        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return x + y;
    }
}

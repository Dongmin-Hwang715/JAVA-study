package java_03_심화;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("입력값: " + Input.read("이름: "));
        System.out.println("입력값: " + Input.read("이름", "홍길동"));
        System.out.println("입력값: " + Input.readInt("나이: "));
        while (true) {
            boolean answer = Input.confirm("종료할까요?", true);
            System.out.println("입력값 : " + answer);
            if (answer) {
                break;
            }
        }
    }
}

package java_02_기본;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println(num + "번이 나왔습니다.");
    }
}

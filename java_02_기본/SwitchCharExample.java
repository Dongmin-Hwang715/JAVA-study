package java_02_기본;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'b';
        switch (grade) {
            case 'a', 'A':
                System.out.println("우수 회원입니다.");
                break;
            case 'b', 'B':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}

package java_02_기본;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int n = (int) (Math.random() * 6) + 1;
            System.out.println(n);
            if (n == 6){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}

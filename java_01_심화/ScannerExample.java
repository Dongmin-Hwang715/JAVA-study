package java_01_심화;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x값 입력:" + x);
        int y = sc.nextInt();
        System.out.println("y값 입력:" + y);
        System.out.println("x + y:" + (x + y));

        while (true) {
            String s = sc.next();
            System.out.println("입력 문자열: " + s);
            if (s.equals("q")) {
                System.out.println("종료");
                break;
            }
            System.out.println("출력 문자열: " + s);
        }
    }
}

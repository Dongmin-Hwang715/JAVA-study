package java_02_기본;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        int vel = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    -----------------------------
                    1. 증속 | 2. 감속 | 3. 중지
                    -----------------------------""");
            int i = sc.nextInt();
            System.out.println("선택: " + i);
            if (i == 1) {
                vel++;
                System.out.println("현재 속도 = " + vel);
            } else if (i == 2) {
                if (vel > 0) {
                    vel--;
                }
                System.out.println("현재 속도 = " + vel);
            } else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}

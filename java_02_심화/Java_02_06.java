package java_02_심화;

import java.util.Scanner;

public class Java_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        while (true) {
            System.out.println("""
                    ------------------------------
                    1.예금 | 2.출금 | 3.잔고 | 4.종료
                    ------------------------------""");
            System.out.print("선택>");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("예금액>");
                money += sc.nextInt();
            } else if (choice == 2) {
                System.out.print("출금액>");
                int m = Math.min(sc.nextInt(), money);
                money -= m;
            } else if (choice == 3) {
                System.out.println("잔고>" + money);
            } else {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}

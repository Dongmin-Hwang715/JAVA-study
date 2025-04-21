package java_02_기본;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        do {
            input = sc.nextLine();
            System.out.println(">" + input);
        } while (!"q".equals(input));
        System.out.println();
        System.out.println("프로그램 종료");
    }
}

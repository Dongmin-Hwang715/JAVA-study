package java_03_심화;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // 문자열 입력
    public static String read(String title){
        System.out.print(title);
        return scanner.nextLine();
    }
    public static String read(String title, String defaultValue){
        System.out.print(title + "(" + defaultValue + "): ");
        String value = scanner.nextLine();
        if (value.isEmpty()){
            return defaultValue;
        } else {
            return value;
        }
    }

    // 정수 입력
    public static int readInt(String title){
        System.out.print(title);
        int value = Integer.parseInt(scanner.nextLine());
        return value;
    }

    // yes/no 확인
    public static boolean confirm(String title, boolean defaultValue){
        String yesOrNo;
        String answer;

        if (defaultValue) {
            yesOrNo = "(Y/n) ";
        } else {
            yesOrNo = "(y/N) ";
        }
        System.out.print(title + yesOrNo);
        answer = scanner.nextLine();
        
        if (answer.isEmpty()){
            return defaultValue;
        } else {
            return "y".equals(answer.toLowerCase());
        }
    }
    public static boolean confirm(String title){
        return confirm(title, true);
    }
}

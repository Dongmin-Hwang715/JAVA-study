package java_02_기본;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if (hobby.isEmpty()) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}

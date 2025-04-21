package java_02_기본;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int i = subject.indexOf("프로그래밍");
        System.out.println(i);

        int n = subject.indexOf("자바");
        if (n != -1) {
            System.out.println("자바와 관련된 책이군요.");
        }
    }
}

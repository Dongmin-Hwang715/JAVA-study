package java_01_기본;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name);
        System.out.println(job);
        System.out.println("나는 \"자바\"를 배웁니다.");
        System.out.println("번호 \t 이름 \t 직업");
        System.out.println("""
                나는
                자바를
                배웁니다.""");
    }
}

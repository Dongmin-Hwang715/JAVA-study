package java_06_기본;

public class A04Example {
    public static void main(String[] args) {
        // B 객체 생성 및 인스턴스 필드 및 메소드 사용
        A04.B b = new A04.B();
        System.out.println(b.field1);
        b.method1();

        // B 클래스의 정적 필드 및 메소드 사용
        System.out.println(A04.B.field2);
        A04.B.method2();
    }
}

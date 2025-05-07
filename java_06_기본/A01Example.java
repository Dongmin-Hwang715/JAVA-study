package java_06_기본;

public class A01Example {
    public static void main(String[] args) {
        // A 객체 생성
        A01 a = new A01();

        // B 객체 생성
        A01.B b = a.new B();
    }
}

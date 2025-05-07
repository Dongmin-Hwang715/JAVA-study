package java_06_기본;

public class A01 {
    // 인스턴스 멤버 클래스
    class B {}

    // 인스턴스 필드 값으로 B 객체 대입
    B field = new B();

    // 생성자
    A01(){
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}

package java_04_기본;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // parent.field2 = "data2";
        // parent.method3();
        // Parent 클래스에는 field2 필드, method3() 메서드가 없으므로
        // 오류가 발생한다

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}

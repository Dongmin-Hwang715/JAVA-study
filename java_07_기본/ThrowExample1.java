package java_07_기본;

public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (Exception e) {
            System.out.println("예외처리: " + e.toString());
        }
    }

    public static void findClass() throws Exception {
        Class.forName("java.lang.String2");
    }
}

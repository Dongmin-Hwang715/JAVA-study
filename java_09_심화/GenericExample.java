package java_09_심화;

public class GenericExample {
    // boxing 제너릭 메서드 정의
    static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}

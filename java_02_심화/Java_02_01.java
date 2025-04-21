package java_02_심화;

public class Java_02_01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

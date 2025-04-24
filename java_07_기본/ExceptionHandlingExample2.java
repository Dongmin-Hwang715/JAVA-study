package java_07_기본;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        try {
            for (int i = 0; i<=array.length; i++){
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("데이터에 문제가 있음: " + e.getMessage());
        }
    }
}

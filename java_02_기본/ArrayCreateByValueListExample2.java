package java_02_기본;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores = new int[] {83, 90, 87};
        printItem(scores);
    }
    public static void printItem(int[] items){
        for (int i = 0; i < items.length; i++) {
            System.out.println("score[" + i + "]: " + items[i]);
        }
    }
}

package java_02_기본;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
        for (int i = 0; i < 4; i++){
            System.out.println("season[" + i + "] : " + season[i]);
        }
        System.out.println();

        int[] scores = { 83, 90, 87 };
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (double) sum / scores.length);
    }
}

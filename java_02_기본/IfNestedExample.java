package java_02_기본;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = 81 + (int)(Math.random() * 20);
        System.out.println("점수: " + score);
        String grade = "";
        if (score >= 95) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 85) {
            grade = "B+";
        } else {
            grade = "B";
        }
        System.out.println("학점: " + grade);
    }
}

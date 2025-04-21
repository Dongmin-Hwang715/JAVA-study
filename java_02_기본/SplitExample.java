package java_02_기본;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] boardArray = board.split(",");

        System.out.println("번호: " + boardArray[0]);
        System.out.println("제목: " + boardArray[1]);
        System.out.println("내용: " + boardArray[2]);
        System.out.println("성명: " + boardArray[3]);
        System.out.println();

        for (String str : boardArray) {
            System.out.println(str);
        }
    }
}

package java_07_기본;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder() // 빈 문자열
                .append("DEF") // "" + "DEF"
                .insert(0, "ABC") // "ABC" + "DEF"
                .delete(3, 4) // 3번째 인덱스의 문자 제거 -> "ABCEF"
                .toString(); // 문자열로 변환
        System.out.println(data);
    }
}

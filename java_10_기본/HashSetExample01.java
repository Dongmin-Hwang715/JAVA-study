package java_10_기본;

import java.util.*;

public class HashSetExample01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");;
        set.add("iBATIS");

        // 저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);
        // 중복된 "Java"가 들어가지 않으므로 총 객체 수는 4가 출력된다.
    }
}

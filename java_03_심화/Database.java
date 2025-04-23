package java_03_심화;

public class Database {
    private static String connection = "MySQL";

    public static String connect(){
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }
    public static void close(){
        System.out.println(connection + "을 닫습니다.");
    }
}

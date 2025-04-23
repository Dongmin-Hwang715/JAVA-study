package java_03_심화;

public class DatabaseExample {
    public static void main(String[] args) {
        System.out.println("데이터베이스: " + Database.connect());
        Database.close();
    }
}

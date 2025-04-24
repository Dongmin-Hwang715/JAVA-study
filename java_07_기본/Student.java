package java_07_기본;

public class Student {
    private int no;
    private String name;

    // 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // Setter
    public void SetNo(int no) {
        this.no = no;
    }
    public void SetName(String name) {
        this.name = name;
    }

    // Getter
    public int GetNo() {
        return no;
    }
    public String GetName() {
        return name;
    }
}

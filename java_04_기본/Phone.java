package java_04_기본;

public class Phone {
    public String model;
    public String color;

    public Phone() {}
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
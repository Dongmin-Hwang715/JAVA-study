package java_03_기본;

public class Car2 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car2(){}
    public Car2(String model){
        this.model = model;
    }
    public Car2(String model, String color){
        this.model = model;
        this.color = color;
    }
    public Car2(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

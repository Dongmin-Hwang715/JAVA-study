package java_03_기본;

public class Car3 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car3(String model){
        this(model, "은색", 200);
    }
    Car3(String model, String color){
        this(model, color, 200);
    }
    Car3(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

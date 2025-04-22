package java_03_기본;

public class Car5 {
    String model;
    int speed;

    public Car5(String model){
        this.model = model;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void run(){
        System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
    }
}

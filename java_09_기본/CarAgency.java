package java_09_기본;

public class CarAgency implements Rentable{
    @Override
    public Car2 rent() {
        return new Car2();
    }
}

package java_09_기본;

public class HomeAgency implements Rentable{
    @Override
    public Home rent() {
        return new Home();
    }
}

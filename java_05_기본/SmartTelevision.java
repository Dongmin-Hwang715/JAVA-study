package java_05_기본;

public class SmartTelevision implements RemoteControl3, Searchable {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}

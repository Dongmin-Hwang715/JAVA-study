package java_05_기본;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl3 rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}

package java_05_기본;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc = new Audiot();
        rc.turnOn();
    }
}

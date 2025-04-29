package java_05_기본;

public class RemoteControlExample2 {
    public static void main(String[] args) {
        RemoteControl2 rc;
        rc = new Television2();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio2();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}

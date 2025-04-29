package java_05_기본;

public class Television2 implements RemoteControl2{
    private int volume;

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        }
        this.volume = volume;
        System.out.println("현재 TV 볼륨: " + volume);
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}

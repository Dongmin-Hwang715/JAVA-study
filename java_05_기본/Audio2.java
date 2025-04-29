package java_05_기본;

public class Audio2 implements RemoteControl2 {
    private int volume;

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        }
        this.volume = volume;
        System.out.println("현재 Audio 볼륨: " + volume);
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
}

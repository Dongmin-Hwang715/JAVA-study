package java_08_심화;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread mt = new MovieThread();
        Thread mr = new Thread(new MusicRunnable());

        mt.start();
        mr.start();
    }
}

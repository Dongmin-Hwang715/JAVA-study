package java_03_기본;

public class Computer {
    int sum(int ...values) {
        int output = 0;
        for (int i : values) {
            output += i;
        }
        return output;
    }
}

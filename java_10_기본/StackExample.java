package java_10_기본;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coins = new Stack<Coin>();

        coins.push(new Coin(100));
        coins.push(new Coin(50));
        coins.push(new Coin(500));
        coins.push(new Coin(10));

        while (!coins.isEmpty()) {
            int value = coins.pop().getValue();
            System.out.println("꺼내온 동전 : " + value + "원");
        }
    }
}

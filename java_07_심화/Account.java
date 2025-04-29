package java_07_심화;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money){
        if (balance >= money){
            balance -= money;
        } else {
            throw new InsufficientException();
        }
    }
}

package ch11.sec06;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void checkBalance() {
        System.out.printf("예금액: %,d원\n", balance);
    }

    //입금
    public void deposit(int money) {
        balance += money;
    }

    //출금
    //예외객체를 던진다면 메소드에 throws로 어떤 예외를 던지는지 명시해줘야 한다.
    public void withdraw(int money) throws InsufficientException, ArrayIndexOutOfBoundsException {
        if(money % 2 == 0) {
            throw new ArrayIndexOutOfBoundsException("입금금액이 짝수일 순 없다.");
        }
        if(balance < money) {
            throw new InsufficientException("잔고 부족: " + (money-balance) + "원이 부족함");
        }
        balance -= money;
    }


}

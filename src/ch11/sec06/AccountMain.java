package ch11.sec06;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(20_000);
        //System.out.println("예금액: " + account.getBalance());
        account.checkBalance(); //예금액: 20000원
        try {
            account.withdraw(25_001);
        } catch (InsufficientException e) {
            System.out.println("insufficient 예외: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array 예외: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생");
        }

        account.checkBalance(); //예금액: 14,999원
    }
}

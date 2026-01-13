package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        //----- [start] 대신, 3, 5 리터럴 사용 금지!!!
        int temp = x;
        x = y;
        y = temp;
        //----- [end]
        System.out.println("x: " + x + ", y: " + y);
        System.out.printf("x: %s, y: %d\n", "65", y);
    }
}

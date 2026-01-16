package ch06.sec08;

public class CalculatorMain {
    public static void main(String[] args) {
        //Calculator 객체화 해주세요.
        Calculator cal = new Calculator();
        cal.powerOff();
        cal.powerOn();
        int result = cal.plus(10, 20);
        System.out.println("result: " + result);

        int n1 = 10, n2 = 3;
        double result2 = cal.divide(n1, n2);
        System.out.println("result2: " + result2);
    }
}

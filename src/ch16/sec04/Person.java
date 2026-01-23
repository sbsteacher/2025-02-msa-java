package ch16.sec04;

public class Person {
    public void action(Calculable c, double x, double y) {
        double r = c.calc(x, y);
        System.out.println("결과: " + r);
    }
}

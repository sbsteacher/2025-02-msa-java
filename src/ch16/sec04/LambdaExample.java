package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        //Person 객체화
        Person p = new Person();

        //Calculable을 implements한 객체 주소값을 action메소드에
        //아규먼트로 보내준다. 10.0, 12.2 계산은 더하기로 한다.
        Calculable c = (a, b) -> a + b;
        double r = c.calc(10, 20);
        p.action( c, 10.0, 12.2 );
        p.action( c, 12.0, 32.2 );
    }
}

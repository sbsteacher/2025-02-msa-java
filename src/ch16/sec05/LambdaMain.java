package ch16.sec05;

import java.util.function.*;

public class LambdaMain {
    /* 내장형 함수 인터페이스
    Consumer - 소비자, 파라미터는 있는데 리턴이 없다(void), 메소드명 accept
    Supplier - 공급자, 파라미터는 없고 리턴만 있다. 메소드명 get
    Function - 파라미터도 있고, 리턴도 있다. 메소드명 apply
    Predicate - 파라미터 있고, 리턴은 boolean. 메소드명 test
    */
    public static void main(String[] args) {
        //Consumer <제네릭>은 파라미터의 타입이다.
        Consumer<Integer> c = (val) -> System.out.println(val + val);
        c.accept(10);
        Consumer<String> c2 = val -> System.out.println(val + val);
        c2.accept("하하");

        //Supplier <제네릭은>은 리턴타입의 타입이다.
        Supplier<String> s = () -> new String("반가워");
        String r1 = s.get();
        System.out.println("r1: " + r1);

        //Function <1, 2> 1이 파라미터 타입, 2가 리턴타입의 타입
        //val 의 타입은 Integer
        //return하는 값의 타입은 Double
        Function<Integer, Integer> f = val -> (int)(Math.random() * val);
        int r2 = f.apply(10);
        System.out.println(r2);

        //BiFunction<1, 2, 3> 1이 첫번째 파라미터 타입, 2가 두번째 파라미터 타입, 3이 리턴타입
        BiFunction<Integer, Integer, Integer> f2 = (sNum, eNum) -> (int)(Math.random() * (eNum - sNum)) + sNum;
        int r3 = f2.apply(2, 5); //2~4 랜덤값
        System.out.println("r3: " + r3);

        //Predicate
        Predicate<String> p = str -> "hello".equalsIgnoreCase(str);
        System.out.println("p: " + p.test("HeLlo"));
    }
}

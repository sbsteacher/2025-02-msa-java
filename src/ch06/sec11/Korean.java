package ch06.sec11;

public class Korean {
    /* 멤버필드에 상수를 사용하면 꼭 초기화를 해주어야 한다.
    명시적 초기화는 Korean이 객체화가 되면 항상 nation은 "대한민국"이
    된다. 즉, 다른 값을 저장할 수 없다.
    그러면 객체화를 할 때 상수값을 결정하고 싶다면 생성자를 이용하면 된다.

    현실 세계의 상수란? 변하지 않는 값

    프로그래밍 언어에서의 변하지 않는 값은 리터럴이라고 부른다.
    프로그래밍 언어에서의 상수란? 한 번 입력된 값이 변하지 않는다.
     */
    final String nation = "대한민국"; //명시적 초기화
    final String ssn;
    String name;

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}

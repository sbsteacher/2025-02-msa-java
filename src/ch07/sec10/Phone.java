package ch07.sec10;
/* 추상클래스란 class 키워드 앞에 abstract 들어간 클래스를 의미한다.
추상클래스는 부모역할만 하겠다.

특징
- 객체화가 안 된다.
- 추상메소드가 있으면 클래스는 무조건 추상 클래스가 되어야한다.
 */
public abstract class Phone {
    //멤버 필드도 가질 수 있다.
    private String owner;

    //추상메소드: 선언부만 있고 구현부가 없는 메소드를 의미
    //나는 이 메소드가 있다는 걸 알고 있다. 내 자식들아~
    //추상메소드는 강제성이 있다. 자식은 무조건 오버라이딩해야 한다.
    public abstract void bell();

    //멤버 메소드도 가질 수 있다.
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
}

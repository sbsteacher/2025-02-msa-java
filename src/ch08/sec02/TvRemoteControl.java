package ch08.sec02;

/* 인터페이스를 상속받을 땐 implements 키워드를 사용한다. 그리고
인터페이스를 상속받는다라고 표현하지 않고 구현한다라고 표현한다.
*/
public class TvRemoteControl implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Tv를 켠다");
    }

    public void turnOff() {
        System.out.println("Tv를 끄다.");
    }
}

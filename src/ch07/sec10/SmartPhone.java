package ch07.sec10;

//Phone클래스를 상속받아 주세요.
public class SmartPhone extends Phone {
    @Override
    public void bell() {
        System.out.println("스마트폰이 울린다.");
    }
}

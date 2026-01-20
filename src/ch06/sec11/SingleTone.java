package ch06.sec11;
/* 프로젝트에서 단 하나의 객체만 만들어서
사용할 수 있도록 구조를 만든 것을 싱글톤

1. 외부에서 객체 생성을 할 수 없다.
2. SingleTone객체를 담을 수 있는 static 변수 필요.
3. 외부에서 객체 주소값을 얻을 수 있는 static 메소드 필요.
*/
public class SingleTone {
    static SingleTone singleTone = new SingleTone();

    String name;
    int age;

    private SingleTone() {}

    static SingleTone getInstance() {
        /* 만약, singleTone 스태틱 멤버필드가 null이라면 SingleTone을
        객체화 하여 주소값을 담아 준다.
        singleTone에 담겨져 있는 주소값을 리턴한다.
        */
        return singleTone;
    }
}

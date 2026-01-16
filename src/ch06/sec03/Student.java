package ch06.sec03;
/* 객체는 무엇으로 이루어져 있는가?
속성: 멤버 필드, 전역 (변수/상수), 역할: 값 저장, 객체가 살아있는 동안 값이 유지된다.
메소드: 멤버 메소드, 역할: 변화 action

클래스는 객체가 아니다. 틀(Frame), 설계도 같은 것

클래스로 실체를 만들면 그게 객체(object, instance)가 된다.

작성 순서는 아래 순서로 작성하자.
멤버필드
생성자
메소드

생성자 vs 메소드 다른점 2가지
1. 이름은 클래스명과 동일
2. 리턴타입을 작성하면 안된다.

생성자의 역할: 객체생성 + 멤버필드 초기화
*/
public class Student {
    int no;
    String name;

    public Student() { //기본 생성자 정의
        no = 0;
        name = "홍길동";
        System.out.println("--Student 기본생성자--");
    }

    void introduceMySelf() {
        System.out.printf("저는 %d번이고 이름은 %s입니다.\n", no, name );
    }
}

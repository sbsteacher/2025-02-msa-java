package ch07.sec02;

//상속 + 생성자 마무리
//Phone클래스를 상속받고 싶다면 extends 키워드를 사용한다.
public class SmartPhone extends Phone {

    private boolean wifi; //전역변수 boolean타입은 디폴트값이 false

    //기본생성자 생성
    public SmartPhone(String model, String color) {
        super(model, color); //부모가 기본 생성자가 없어서 에러발생
    }

    public void toggleWifi() {
        //값을 바꾼다.
        wifi = !wifi;
        System.out.println("wifi: " + wifi);
    }

    /* 메소드 오버라이딩(Overriding)은 부모가 가지고 있는 메소드를
    다시 정의하는 것을 얘기한다. 선언부가 똑같아야 한다.
    @Override 애노테이션을 붙여준다.(실수 방지용)
    부모가 가지고 있지 않은 메소드를 정의하시면 이거는 새로운 메소드를
    추가하는 것. @Override에 빨간줄이 생기면 이건 새로운 메소드를 만든 것이다.
    즉, 부모에 그 메소드가 없다.
    */
    @Override
    public void bell() {
        String model = super.model;
        System.out.println("스마트폰 진동과 벨이 울린다.");
    }
}

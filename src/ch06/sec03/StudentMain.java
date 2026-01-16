package ch06.sec03;
/* main메소드를 가지기 위한 클래스를 만들었다.

*/
public class StudentMain {
    public static void main(String[] args) {
        //Student 객체 생성 (객체화)
        //Student s1은 레퍼런스 변수이고
        //객체의 주소값을 담을 수 있다.
        //단!!!!! Student객체의 주소값만 담을 수 있다.
        //Student s0 = new String(""); //Student객체 주소값만 담을 수 있다.
        //String str0 = new Student(); //String객체 주소값만 담을 수 있다.

        //Student() >> 기본생성자(default constructor)
        //기본생성자는 메소드의 한 종류인데 특별한 메소드다.
        //객체 생성때만 호출할 수 있고 생성 이후에는 호출할 수 없는 메소드이다.
        //객체 생성할 때는 무조건 생성자를 호출해야 합니다.
        //생성자를 정의하지 않으면 컴파일러가 기본 생성자는 자동으로 만들어 준다.
        Student s1 = new Student();
        s1.introduceMySelf();
        s1.no = 1;
        s1.name = "권수영";
        s1.introduceMySelf();

        Student s2 = new Student();
        s2.no = 12;
        s2.name = "임준이";
        s2.introduceMySelf();

        s1.introduceMySelf();
        s2.introduceMySelf();
    }
}

package ch16.sec02;

public class LambdaExample {
    public static void main(String[] args) {
        //Person 객체화
        Person p = new Person();
        //action을 호출하면서 Workable을 implement한 객체 주소값을 전달하시오.
        //1번째 (이름있는) 클래스 이용
        Workable w1 = new Mechanic();
        p.action(w1);

        //2번째 (익명) 클래스 이용
        Workable w2 = new Workable() {
            @Override
            public void work() {
                System.out.println("청소부가 청소를 열심히 한다.");
            }
        };
        p.action(w2);
        p.action(new Workable() {
            @Override
            public void work() {
                System.out.println("청소부가 청소를 열심히 한다.2");
            }
        });

        //3번째 람다식 이용
        Workable w3 = () -> System.out.println("강사가 열심히 강의를 한다.");
        p.action(w3);
        p.action(() -> System.out.println("강사가 열심히 강의를 한다.2"));
    }
}


class Mechanic implements Workable {
    @Override
    public void work() {
        System.out.println("정비공이 정비를 합니다.");
    }
}

package ch06.sec09;

public class Truck {
    /* static은 객체 생성과는 무관하다. 공간이 무조건 하나이다.
       static을 사용할 때는 클래스명. 으로 사용한다.
       객체 생성을 하지 않아도 사용할 수 있다.
     */
    static String company;
    String model;

    void introduce() {
        System.out.printf("company: %s, model: %s\n"
                , company, model);

        run();
    }

    static void run() {
        Truck t = new Truck();
        t.model = "15톤";
        System.out.printf("%s 회사의 %s 모델의 차량이 달린다.\n", company, t.model);
    }
}

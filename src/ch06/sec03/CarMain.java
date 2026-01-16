package ch06.sec03;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("그랜저", "검정", 300);
        c1.introduceMySelf(); //그랜저, 검정, 300

        Car c2 = new Car("K8");
        c2.introduceMySelf(); //K8, 흰색, 290

        Car c3 = new Car();
        c3.introduceMySelf(); //모닝, 회색, 150

        Car c4 = new Car("K5", 220);
        c4.introduceMySelf(); //K5, 회색, 220
    }
}

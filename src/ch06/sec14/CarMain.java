package ch06.sec14;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("그랜저", 170);
        //c1이 가리키는 객체의 모델명을 "소나타"로 변경
        //setter 이용
        c1.setModel("소나타");
        c1.setSpeed(140);
        String model = c1.getModel();
        int speed = c1.getSpeed();
        System.out.printf("model: %s, speed: %d\n", model, speed);
    }
}

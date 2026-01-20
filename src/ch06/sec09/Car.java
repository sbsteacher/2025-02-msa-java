package ch06.sec09;

public class Car {
    String model;
    int speed;

    public Car() {
        this("소나타");
    }

    public Car(String model) {
        this.model = model;
        this.introduce();
    }

    public void introduce() {
        System.out.printf("모델명: %s\n", this.model);
    }
}

package ch06.sec03;

public class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void introduceMySelf() {
        System.out.printf("%s, %s, %d\n", model, color, maxSpeed);
    }
}

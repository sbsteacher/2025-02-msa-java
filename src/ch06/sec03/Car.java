package ch06.sec03;

public class Car {
    String model;
    String color;
    int maxSpeed;

    public Car() {
        this("모닝", "회색", 150);
    }

    public Car(String model) {
        this(model, "흰색", 290);
    }

    public Car(String model, int maxSpeed) {
        this(model, "회색", maxSpeed);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void introduceMySelf() {
        System.out.printf("%s, %s, %d\n", model, color, maxSpeed);
    }
}

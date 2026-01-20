package ch07.sec02;

public class Phone {
    protected String model;
    private String color;

    //public Phone() {}

    //model, color를 외부에서 값을 받아 초기화하는 생성자 생성.
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

    public void sendMessage(String message) {
        System.out.println("본인: " + message);
    }
}

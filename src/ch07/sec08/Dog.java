package ch07.sec08;

public class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("강아지가 멍멍");
    }

    public void jump() {
        System.out.println("강아지가 폴짝~");
    }
}

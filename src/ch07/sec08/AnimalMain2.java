package ch07.sec08;

public class AnimalMain2 {
    /* 대전제3 deep
    메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고,
    호출이 되면 객체 기준에서 메소드를 찾는다.

    Dog 클래스에 새로운 메소드 jump() 추가
    */
    public static void main(String[] args) {
        Animal animal = new BullDog(); //Dog객체는 jump()메소드 갖고 있다.
        animal.crying(); //animal 입장에서는 알고 있는 메소드
        //animal.jump();// animal 입장에서는 모르는 메소드

        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            //dog.jump();
        }
        //jump메소드 호출하고 싶다. 어떻게 해야될까요?
        //new Dog(); 더이상 이거 쓰지 않고

        /* 변수에 담겨져 있는 객체를 타입에 담을 수 있으면 true, 없으면 fals리턴
        왼쪽 변수 우측이 타입
         */
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
    }
}

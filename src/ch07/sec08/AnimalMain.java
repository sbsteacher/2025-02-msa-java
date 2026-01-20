package ch07.sec08;

public class AnimalMain {
    /*  대전제!!!! 3가지
        1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
        2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
        3. 메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고,
           호출이 되면 객체 기준에서 메소드를 찾는다.

        레퍼런스 타입끼리의 형변환은 상속관계에서만 가능하다.
        다형성은 상속관계에서만 나타난다.
     */
    public static void main(String[] args) {
        // 대전제 1번 내용
        // Animal 객체 주소값 담을 수 있는 animal 변수 + Animal 자식 객체의 주소값도 가능.
        Animal animal = new Dog();

        // Dog타입의 변수로 BullDog객체 주소값 담을 수 있을까요?
        Dog dog = new BullDog();
        dog.crying(); //불독이 월~ 월~

        // 대전제 2번 내용
        //Dog dog2 = new Animal(); //컴파일 에러 뜬다.
        //Dog dog2 = (Dog)(new Animal());  //강제 형변환 해도 안 된다. 대전제2번 위반!

        //animal변수에는 Dog객체 주소값이 담겨져 있기 때문에 Dog타입 변수에 주소값 담을 수 있다.
        Dog dog3 = (Dog)animal;

        Dog dog4 = new Dog();
        // 대전제 3번 내용
        animal.crying(); //동물이 운다.



        System.out.println("끝");
    }
}

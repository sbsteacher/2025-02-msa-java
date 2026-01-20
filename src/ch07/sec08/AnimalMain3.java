package ch07.sec08;

public class AnimalMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        AnimalMain3.haha();

        AnimalMain3.doCrying(dog);
        AnimalMain3.doCrying(cat);
        doCrying(bullDog);

    }

    public static void doCrying(BullDog dog) {
        dog.crying();
    }

    public static void doCrying(Dog dog) {
        dog.crying();
    }

    public static void doCrying(Cat cat) {
        cat.crying();
    }

    public static void haha() {
        System.out.println("하하");
    }
}

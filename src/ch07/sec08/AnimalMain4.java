package ch07.sec08;

public class AnimalMain4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        AnimalMain4.doCrying(dog); //강아지가 운다
        AnimalMain4.doCrying(cat); //동물이 운다
        doCrying(bullDog); //강아지가 운다
    }
    public static void doCrying(Animal animal) {
        animal.crying();
    }
}

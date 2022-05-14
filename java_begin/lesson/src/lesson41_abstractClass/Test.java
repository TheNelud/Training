package lesson41_abstractClass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        Animal animal = new Animal();
        cat.makeSound();
        cat.eat();

        dog.makeSound();
        dog.eat();

    }

}

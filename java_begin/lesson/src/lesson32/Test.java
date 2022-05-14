package lesson32;

public class Test {
    public static void main(String[] args) {

        //Upcasting - восходящие преобразование
//        Dog dog = new Dog();
//
//        Animal animal = dog;
//        Animal animal = new Dog();

        //Downcasting - нисходящие преобразование
//        Dog dog2 = (Dog)animal;
//
//        dog2.bark();

        Animal animal = new Animal();
        Dog dog = (Dog)animal;
//        System.out.println(dog.bark());

    }
}

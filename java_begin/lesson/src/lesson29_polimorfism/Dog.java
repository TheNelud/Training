package lesson29_polimorfism;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}

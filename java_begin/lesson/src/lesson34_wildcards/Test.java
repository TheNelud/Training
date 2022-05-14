package lesson34_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Animal(1));
        listAnimal.add(new Animal(2));

        List<Dog> listDogs = new ArrayList<>();
        listDogs.add(new Dog());
        listDogs.add(new Dog());

        test(listAnimal);
        test(listDogs);



    }

    private  static void test(List<? extends Animal> list){  //super
        for (Animal animal: list){
//            System.out.println(animal);
            animal.eat();

        }
    }
}

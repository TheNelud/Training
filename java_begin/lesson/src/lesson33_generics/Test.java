package lesson33_generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///JAva 5//////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String)animals.get(1);
        System.out.println(animal);

        /// с появлением generics//////

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
//        animals2.add(ourAnimal);

        String animal2 =animals2.get(1);

        ////java 7///////

        List<String> animal3 = new ArrayList<>();

    }
}

class Animal{

}

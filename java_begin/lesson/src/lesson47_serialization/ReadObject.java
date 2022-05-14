package lesson47_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        String path = "src\\lesson47_serialization\\data\\people.bin";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){

            Person person1 =  (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

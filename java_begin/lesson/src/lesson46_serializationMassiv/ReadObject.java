package lesson46_serializationMassiv;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        String path = "src\\lesson46_serializationMassiv\\data\\people.bin";

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

//            int person_count = ois.readInt();
//            Person[] people =new Person[person_count];
//
//            for  (int i = 0;i < person_count; i++){
//                people[i] = (Person) ois.readObject();
//
//            }

            Person[] people =  (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));


            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

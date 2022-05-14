package lesson46_serializationMassiv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                            new Person(2, "Mike"),
                            new Person(3,"Tom")};

        String path = "src\\lesson46_serializationMassiv\\data\\people.bin";

        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeInt(people.length);
//
//            for (Person person : people){
//                oos.writeObject(person);
//            }
            oos.writeObject(people);


            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package lessons_collections.lesson2_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("Класс LinkedList");
        measureTime(linkedList);
        System.out.println("\nКласс ArrayList");
        measureTime(arrayList);
    }

    public static void measureTime(List<Integer> list){
        long startAdd = System.currentTimeMillis();
        for (int i= 0; i < 100000; i++){
//            list.add(i); // добавление в конец массива
            list.add(0,i); // добавления в начала массива
        }
        long endAdd = System.currentTimeMillis();
        System.out.println("Время записи: "+ (endAdd - startAdd));

        long startGet = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            list.get(i);
        }
        long endGet = System.currentTimeMillis();
        System.out.println("Время чтения: "+(endGet - startGet));
    }

}

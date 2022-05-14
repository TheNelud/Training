package lessons_collections.lesson1_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i=0; i < 10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));

        System.out.println(arrayList.size());

        for (int i = 0; i< arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");

        System.out.println();

        for (Integer x : arrayList){
            System.out.print(x + " " );
        }

        System.out.println();

        arrayList.remove(5);
        System.out.println(arrayList);

        arrayList = new LinkedList<Integer>();
    }
}

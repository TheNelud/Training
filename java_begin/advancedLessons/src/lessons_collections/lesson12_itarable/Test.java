package lessons_collections.lesson12_itarable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //Java 5
        for (int x : list){ //не можем изменять лист во время прохода foreach
            System.out.println(x);
        }

        int idx = 0;
        //до java 5
        Iterator<Integer> iterator = list.iterator(); //а тут можем изменять
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if (idx == 1){
                iterator.remove();
            }
            idx ++;
        }

        System.out.println(list);


    }
}

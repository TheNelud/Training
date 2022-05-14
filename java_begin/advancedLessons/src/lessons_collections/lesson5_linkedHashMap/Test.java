package lessons_collections.lesson5_linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();                 // внутри не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();     //в каком порядке были добавлены в таком и вернутся
        Map<Integer, String> treeMap = new TreeMap<>();                 //пары (ключ значения), сортируется по ключю(естественный порядок)

        testMap(treeMap);

        }

    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(43, "Jack");
        map.put(1, "Will");
        map.put(3, "Ron");
        map.put(1443, "Bob");
        map.put(24, "Fess");
        map.put(2, "Cris");

        for(Map.Entry<Integer,String> entry: map.entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

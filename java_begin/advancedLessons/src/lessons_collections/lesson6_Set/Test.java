package lessons_collections.lesson6_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); //множество, все элементы уникальны(никакого порядка)
        Set<String> linkedHashSet = new LinkedHashSet<>(); // как запердолил так и вынул
        Set<String> treeSet = new TreeSet<>(); // сортируется по порядку

        hashSet.add("Mike0");
        hashSet.add("Mike1");
        hashSet.add("Mike2");
        hashSet.add("Mike0");

        linkedHashSet.add("Mike0");
        linkedHashSet.add("Mike1");
        linkedHashSet.add("Mike2");
        linkedHashSet.add("Mike3");

        treeSet.add("Mike0");
        treeSet.add("Mike14");
        treeSet.add("Mike233");
        treeSet.add("Mike3");

//        System.out.println(hashSet);
//
//        for(String name : hashSet){
//            System.out.println(name);
//        }
//        System.out.println(hashSet.contains("Tom")); //есть ли такой чувак в множестве? false
//        System.out.println(hashSet.contains("Mike0")); //true
//
//        System.out.println(hashSet.isEmpty()); //пустое или нет ?


        /**Теория множест
         * Пересечение a.intersect(b) что есть в обоих множествах
         * Обьеденение a.union(b) просто обьеденение
         * Разность a.subtract(b) ну остается только первое множество без куска Б
         * Симметрическая разность a.exclusive0r(b) просто остается дыра в месте пересечения
         */

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);

        //union - обьеденение
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union);
        //intersection - пересечения множеств
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);

        //difference -разность множеств
        Set <Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference);
    }
}

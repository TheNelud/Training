package lessons_collections.lesson10_queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);


        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
//        people.add(person3);
//        people.add(person2);
//        people.add(person4);
//        people.add(person1);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));

//        System.out.println(people.remove());//удаляем элемнт
//        System.out.println(people.peek()); //смотрим на первый элемент в очереди
//
//        for (Person person : people)
//            System.out.print(person);
    }
}

class Person{
    private int id;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id) {
        this.id = id;
    }
}

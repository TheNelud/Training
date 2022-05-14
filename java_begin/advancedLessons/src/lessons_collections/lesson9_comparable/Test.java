package lessons_collections.lesson9_comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(personList);
        addElements(personSet);

        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(personSet);

    }

    private static void addElements(Collection collections){
        collections.add(new Person(1,"Bob"));
        collections.add(new Person(2,"Tom"));
        collections.add(new Person(4,"Katy"));
        collections.add(new Person(3,"George"));

    }
}

class Person implements Comparable <Person>{
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        //сортировка по id
//        if (this.id > o.getId()){
//            return 1;
//        }else if(this.id < o.getId()){
//            return -1;
//        }else{
//            return 0;
//        }

        //сортировка по длине имени
        if (this.name.length() > o.getName().length()){
            return 1;
        }else if(this.name.length() < o.getName().length()){
            return -1;
        }else{
            return 0;
        }

    }
}

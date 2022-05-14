package lesson42_equals;

public class Test {
    public static void main(String[] args) {
        // animal1  ->             {1}
        // animal2  ->             {1}
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);
        System.out.println(animal1.equals(animal2));

        String string1 = "Hello!"; // String1 -> {"Hello!"}
        String string2 = "Hello!"; // String2           StringPool
        System.out.println(string1.equals(string2));
    }
}

class Animal {
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}

package lesson35;

//class Animal{
//    public void eat(){
//        System.out.println("animal is eating ...");
//    }
//}

interface Animal{
    public void eat();
}
//class OtherAnimal extends Animal{
//    @Override
//    public void eat() {
//        System.out.println("Other animal is eating...");
//    }
//}


public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();

//        Animal animal1 = new Animal(){
//            @Override
//            public void eat() {
//                System.out.println("Other animal eating...");
//            }
//        };
//
//        animal1.eat();
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("adas");
            }
        };
    }
}

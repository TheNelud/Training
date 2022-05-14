package lesson48_enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.toString());
        System.out.println(animal.getTranslation());

//
//        switch (animal){
//            case CAT -> System.out.println("Its a cat");
//            case DOG -> System.out.println("Its a dog");
//            case FROG -> System.out.println("its a frog");
//            default -> System.out.println("Ok");
//
//        }

        Seasons season = Seasons.WINTER;
        System.out.println(season.name());
        System.out.println(season.getTemperature());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());

        Seasons winter = Seasons.WINTER;
        System.out.println(winter.ordinal());
        //Object -> Enum -> Season

//        System.out.println(season instanceof Seasons);
//        System.out.println(season instanceof Enum);
//        System.out.println(season.getClass());

//        switch (season){
//            case SUMMER -> System.out.println("Its warm outside!");
//            case WINTER -> System.out.println("its cold outside!");

//        }

    }
}

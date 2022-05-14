package day01;

public class Tasks {
    public static void main(String[] args) {
        String java = "JAVA";
        int num = 10;

        System.out.println("Задача 1");
        while (num>0){
            System.out.print(java + " ");
            num -= 1;
        }

        System.out.println("\nЗадача 2");
        for (int i = 0; i < 10; i++){
            System.out.print(java + " ");
        }

        System.out.println("\nЗадача 3");
        for (int i = 0; i < 10; i++){
            System.out.println(java);
        }

        System.out.println("\nЗадача 4");
        int year = 1980;

        while (year < 2022){
            System.out.println("Олимпиада " + year + "года");
            year += 4;
        }

        System.out.println("\nЗадача 5");
        for(int i = 1980; i < 2022; i += 4){
            System.out.println("Олимпиада " + i + "года");
        }

        System.out.println("\nЗадача 6");
        int k = 4;

        for (int i = 1; i < 10; i++){
            System.out.println(i + " x " + k + " = " + i*k);
        }
    }
}

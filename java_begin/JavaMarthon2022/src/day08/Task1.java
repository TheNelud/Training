package day08;

public class Task1 {
    public static void main(String[] args) {
        int numbers = 0;
        StringBuilder string = new StringBuilder();
        while (numbers < 20000 ){
            numbers ++;
            string.append(numbers + " ");
        }

        System.out.println(string);
        // 1sec 613ms

        int numbers2 = 0;
        String string2 = "";
        while (numbers2<200000){
            numbers2++;
            string2 = string2 + numbers2 + " ";
        }
        System.out.println(string2);


    }
}

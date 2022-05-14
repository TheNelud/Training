package lesson49_recurse;

public class Test {
    public static void main(String[] args) {

        System.out.println(fuck(4));
    }

    private static int fuck(int n){
        if (n == 1)
            return 1;
        return n * fuck(n-1);



    }
}

package day07;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        while(player1.getStamina() != 0){
            player1.run();
        }
        while(player2.getStamina() != 0){
            player2.run();
        }

        Player.info();

    }
}

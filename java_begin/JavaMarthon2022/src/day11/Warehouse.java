package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public String toString(){
        return "Количество собранных заказов: " + countOrder +
                "\nДоход от доставленных заказов: "+ balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int i) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

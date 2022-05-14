package lessons_collections.lesson3_myLinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(20);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);

        System.out.println(myLinkedList);


    }
}

package lessons_multithreading.lesson3_synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
//        Test test = new Test();
//        test.doWork();

        new Worker().main();

    }

//    public synchronized void increment(){
//        counter++;
//    }

    public void increment(){
        synchronized (this){
            counter++;
        }

    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 10000;i++){
//                    counter = counter + 1;//counter ++
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
//                    counter = counter + 1;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }



}

class Worker{
    Object lock1 = new Object();
    Object lock2 = new Object();

    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() throws InterruptedException {
        synchronized (lock1){
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }

    }
    public void addToList2() throws InterruptedException {
        synchronized (lock2){
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }

    }

    public void work() throws InterruptedException {
        for (int i = 0; i < 1000; i++ ){
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();

        System.out.println("Result : " + (after - before) + " ms");

        System.out.println("List 1: "+list1.size());
        System.out.println("List 2: "+list2.size());

    }
}


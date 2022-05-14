package lessons_multithreading.lesson1;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println("I going sleep");
        Thread.sleep(3000);
        System.out.println("I Am awake");
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i<100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello MyThread " + i);
        }

    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i<100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello MyThread " + i);
        }
    }

}

package lessons_multithreading.lesson10_Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        Semaphore semaphore = new Semaphore(3); //кол-во разрешений для потоков
//        semaphore.acquire(); //начало работы с ресурсом
//        semaphore.acquire();
//        semaphore.acquire();
//        System.out.println("All permites have been acquire");
//        semaphore.acquire();
//        System.out.println("Can`t reach here...");
//
//        semaphore.release(); //когда заканчиваем использовать ресурс
//        System.out.println(semaphore.availablePermits());

        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}


//Singleton
class Connection{
    private static Connection connection = new Connection();
    private int connectionCounter;
    private Semaphore semaphore = new Semaphore(10);


    private Connection(){}

    public static Connection getConnection(){
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try{
            doWork();
        }finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this){
            connectionCounter++;
            System.out.println(connectionCounter);
        }
        Thread.sleep(5000);

        synchronized (this){
            connectionCounter--;
        }
    }


}

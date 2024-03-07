package Multithreading.CountDownLatchClass;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CDL {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3); // Как только это число отсчитано, await больше не ждет

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++){
            executorService.submit(new Processor(i, countDownLatch));
        }

        executorService.shutdown();

        for (int i = 0; i < 3; i++){
            Thread.sleep(1000);
            countDownLatch.countDown();
        }

    }
}

class Processor implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;
    public Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread with id " + id + " proceed.");
    }


}
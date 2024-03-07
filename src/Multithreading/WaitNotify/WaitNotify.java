package Multithreading.WaitNotify;

import java.util.Scanner;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {

        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}


class WaitAndNotify{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread started...");
            wait(); // только в пределах блока synchronized, 1 - отдаем intrinsic lock, 2 - ждем пока будет вызван notify()
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException{

        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify(); // пробуждает тот поток, в котором был вызван wait !! Должны быть вызваны на одном объекте (по умолч. this, иначе указываем явно объект)
            // notify() не отдает монитор, в данном случае блок заканчивается, поэтому монитор освобождается и может снова выполняться другим потоком
        }

    }
}
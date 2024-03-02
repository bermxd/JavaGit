package Multithreading.Volatile;

import java.util.Scanner;

public class Volatile {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutDown();

    }
}

class MyThread extends Thread{
    private volatile boolean running = true;
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutDown(){
        this.running = false;
    }
}
// volatile гарантирует когерентность кэшей ядер, сообщает о том, что переменная может изменяться и она не будет храниться в кэше, хранение перемнной а главной памяти
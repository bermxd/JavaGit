package Multithreading.Task0;

public class Task0 {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}


class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

// Потоки не синхронизированы
// class extends Thread -> переопределить run(), но вызывать start()
// class implements Runnable (интерфейс) -> run() -> при создании нового потока передаем в качестве аргумента объект класса Runner в конструктор
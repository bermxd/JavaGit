package Annot;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

//        myThread.join();

        System.out.println("Hello from main thread");

    }
}

class MyThread extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello from MyThread");
    }
}

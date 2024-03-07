package Multithreading.DeadLock;

import java.util.Random;
// DEADLOCK в блоке SYNCHRONIZED() -> ничего не поделать, используем Reentrantlock, либо во всех методах синхронизироваться в одном порядке
public class DL {
    public static void main(String[] args) throws InterruptedException {

        Runner runner = new Runner();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();

    }
}

class Runner{
    private Account account1 = new Account();
    private Account account2 = new Account();

    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++){
            synchronized (account1){
                synchronized (account2){
                    Account.transfer(account1,account2, random.nextInt(100));
                    /// Выполняется только в том случае, когда поток завладеет обоими акками
                }
            }
        }
    }

    public void secondThread(){
        Random random = new Random();
        for (int i = 0; i < 10000; i++){
            synchronized (account2){
                synchronized (account1){
                    Account.transfer(account2,account1, random.nextInt(100));
                    /// Выполняется только в том случае, когда поток завладеет обоими акками
                }
            }
        }
    }

    public void finished(){
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance = " + (account1.getBalance()+account2.getBalance()));
    }
}

class Account{
    private int balance = 10000;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }

    public static void transfer(Account account1, Account account2, int amount){
        account1.withdraw(amount);
        account2.deposit(amount);
    }
}
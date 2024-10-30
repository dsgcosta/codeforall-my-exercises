package io.codeforall.fanstatics;

public class CaldasFactory {
    public static void main(String[] args){
        System.out.println("Manager: waiting for workers to be done");

        System.out.println(Thread.currentThread().getName());

        Thread threadWorker = new Thread(new CaldasWorker());
        threadWorker.start();

        Thread threadWorker2 = new Thread(new CaldasWorker());
        threadWorker2.start();

        try{
            threadWorker.join();
            threadWorker2.join();
        } catch(InterruptedException e) {
            System.out.println("Not finished, yet you woke me up");
            e.printStackTrace();
        }
        System.out.println("Manager: Finally it's done, I'm going to C");
    }
}

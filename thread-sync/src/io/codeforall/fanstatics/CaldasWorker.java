package io.codeforall.fanstatics;

public class CaldasWorker implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName()+ "CaldasWorker doing a Caralho");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I was sleeping");
                e.printStackTrace();
            }
        }

        System.out.println("CaldasWorking: not doing more Caralhos");
    }
}

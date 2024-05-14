package MultiThreads;

import java.util.ArrayList;

public class WaitNotify_Test {
    public static void main(String[] args) throws InterruptedException {
        Thread_Test1 t1 = new Thread_Test1();
        t1.start();
        synchronized (t1) { //без синзнонвзоапного блоку буде помилка.
            t1.wait(); //мусить бути синхронізованим
        }
        System.out.println(t1.total);

    }
    static class Thread_Test1 extends Thread {
        int total;
        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    total+=i;
                    try {
                        sleep(500);
                    } catch (Exception e){
                        System.out.println("EXEPTIOOON");
                    }
                }
                notify();
            }
        }
    }
}

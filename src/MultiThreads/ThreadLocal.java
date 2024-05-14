package MultiThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocal {
//    ThreadLocal в Java - це клас, який дозволяє зберігати окремий екземпляр змінної
//    для кожного потока. Це означає, що кожен потік має свою власну копію змінної, і
//    зміни, зроблені одним потоком, не впливають на значення змінної в інших потоках.
    static java.lang.ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
    public static void main(String[] args) throws InterruptedException {
        threadLocal.set("Hello world");
        Thread one = new TheadLocaltest1();
        Thread two = new TheadLocaltest2();
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("main " + threadLocal.get());

    }
    static class TheadLocaltest1 extends Thread {
        @Override
        public void run() {
            threadLocal.set("thread1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("threadtext1 " +  threadLocal.get());
        }
    }
    static class TheadLocaltest2 extends Thread {
        @Override
        public void run() {
            threadLocal.set("thread2");
            System.out.println("threadtext2 " +  threadLocal.get());
        }
    }
}

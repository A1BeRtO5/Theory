package MultiThreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksTest {
//    локс - інтерфейс який допомагає
    public static void main(String[] args) throws InterruptedException {
        Mtread2 mtread2 = new Mtread2();
        Thread t1 = new Thread(mtread2);
        Thread t2 = new Thread(mtread2);
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println(mtread2.getX());
}

}
class Mtread2 extends Thread{
    Lock lock = new ReentrantLock();
    int x = 0;
    public void run() {
        lock.lock();//закриваю на ключик
        for (int i = 0; i < 1000; i++) {
            x++;
        }
        lock.unlock();// відкриваю

    }
    public int getX() {
        lock.unlock();// відкриваю

        return x;
    }
}

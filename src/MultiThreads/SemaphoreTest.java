package MultiThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
//    семафор - це такий клас який допомагає нам контролювати скільки потоків може
//    працювати над одним обєктом.
//    -як синхронізація але не один потік а багато
    public static void main(String[] args) {// одночасно виконується тільки 2 потока
        Semaphore semaphore = new Semaphore(3);
        SemaphoreThreadsTest s1 = new SemaphoreThreadsTest();
        s1.semaphore = semaphore;
        SemaphoreThreadsTest s2 = new SemaphoreThreadsTest();
        s2.semaphore = semaphore;
        SemaphoreThreadsTest s3 = new SemaphoreThreadsTest();
        s3.semaphore = semaphore;
        SemaphoreThreadsTest s4 = new SemaphoreThreadsTest();
        s4.semaphore = semaphore;
        SemaphoreThreadsTest s5 = new SemaphoreThreadsTest();
        s5.semaphore = semaphore;

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);
        Thread t4 = new Thread(s1);
        Thread t5 = new Thread(s1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


}
}
class SemaphoreThreadsTest extends Thread {
    Semaphore semaphore;
    public void run() {
        try {
            semaphore.acquire(); // ставимо лок на два (вузьке горлишко)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            semaphore.release();//забираємо лок.
        }
    }
}
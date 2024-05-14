package MultiThreads;

public class StateTest {
//    NEW: Потік створений, але ще не запущений.
//    RUNNABLE: Потік виконується або готовий до виконання. Це означає, що він може бути
//             виконаний, але може бути призупинений або очікувати ресурси.

//    якшо два потоки і одне ядро проца то один
//         -потік який виконується буде running
//         -а той шо чекає runnable

//    BLOCKED: Потік чекає блокування для входу в синхронізований блок або метод.
//    WAITING: Потік очікує на спеціальному умовному блокуванні, наприклад, виклик методу
//             Object.wait().
//    TIMED_WAITING: Потік очікує на спеціальному умовному блокуванні з тайм-аутом, наприклад,
//             виклик методу Object.wait(long timeout).
//    TERMINATED: Потік завершив виконання.
public static void main(String[] args) {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();
    System.out.println(t1.getState());

    t1.start();
    t2.start();
    t3.start();

    t2.setPriority(8);// пріорітет потоку 1 найнижчий 10 найвищий
    System.out.println(t1.getState());

}
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

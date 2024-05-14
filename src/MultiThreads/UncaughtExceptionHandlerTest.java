package MultiThreads;

public class UncaughtExceptionHandlerTest {
//    UncaughtExceptionHandler - це інтерфейс в Java, який використовується для обробки винятків, які не були перехоплені (uncaught exceptions) у потоках.
//    Кожен потік може мати свого власного обробника не перехоплених винятків, що дозволяє централізовано керувати винятками в програмі.
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        myRun.run();
    }


}
class MyRun implements java.lang.Runnable {

    @Override
    public void run() {
        Thread.currentThread().setUncaughtExceptionHandler(new ExeptionHand());
        String text = "1234";
        while (true) {
            int number = Integer.parseInt(text);//переводить стрінг в інт
            System.out.println(number);
            text = text.substring(1); // видаляє перше число 1234 234 34 4
            try {
                Thread.sleep(500); //кидає ексепшин коли число = null
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
 class ExeptionHand implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("exeption!!");

        System.out.println("restarting");
        new Thread(new MyRun()).start(); // запускає заново потік
    }
}
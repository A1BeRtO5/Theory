package MultiThreads;

public class Daemon {
//    демон потік - це це потік, який працює у фоновому режимі і обслуговує інші
//                  потоки або фонові завдання.
//    основна відмінність в тому що поки не закінчиться робота в потоках
//    не демонах програма не завершиться.

//  але якшо всі не демони потоки закінчили роботу то програма завершиться навіть коли
//  демони ще працюють
//  хоч потік демон і має писати лала вічно але ппрога закінчила роботу бо це демон
public static void main(String[] args) {
    MyDaemon myDaemon = new MyDaemon();
//    myDaemon.setDaemon(true); - те сама що в конструкторі (19строка)
    myDaemon.start();
    Thread t1 = new Thread() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };
    t1.start();
}
}
class MyDaemon extends Thread {
    public MyDaemon() {
        setDaemon(true);// те саме що в мейні(14строка)
    }

    @Override
    public void run() {
        while (true){
            System.out.println("lala");
            try {
                sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

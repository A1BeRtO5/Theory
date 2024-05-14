package MultiThreads;

public class Deadlock {
//    Deadlock - ситуація коли один потік очікує розблокування обєкта отриманого другим потоком
//            а другий потік очікує розблокування обєкта отриманого першим потоком

//    коли два або більше потоків назавжди заблоковані очікуючи один одного

    // щоб вирішити цю проблему потрібно використовувати такий самий ланцюг обробки firstResource -> secondResource
    public static void main(String[] args) {
        String firstResource = "first";
        String secondResource = "second";
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (firstResource) {//залочено першим поток тут
                    System.out.println(Thread.currentThread().getName() + " LockedResource= " + firstResource);
                    try {
                        Thread.sleep(50);
                    } catch (Exception ignored) {
                    }
                    synchronized (secondResource) {// чекає коли розлочить другий потік
                        System.out.println(Thread.currentThread().getName() + " LockedResource= " + secondResource);

                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (secondResource) {//залочено другим потоком тут
                    System.out.println(Thread.currentThread().getName() + " LockedResource= " + secondResource);
                    try {
                        Thread.sleep(50);
                    } catch (Exception ignored) {
                    }
                    synchronized (firstResource) {// чекає коли розлочить перший потік
                        System.out.println(Thread.currentThread().getName() + " LockedResource= " + firstResource);

                    }
                }
            }
        };
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package MultiThreads;

public class Synchronized_Test {
//    Synchronized- це ключове слово в джава яке використовується для синхронізованих блоків
//        коду та методів.
//    це дозволяє уникнути проблем з взаємодією потоків при доступі до спільних ресурсів.
    private static int count;
    public static void main(String[] args) {
        java.lang.Runnable runnable = new java.lang.Runnable() {
//            @Override
//            synchronized public void run() { //- синхронайзд блокує виконання другого потоку
//            count = 0; // поки не виконається перший
//            for (int i = 0; i < 5; i++){
//                    count++;
//                    System.out.println(Thread.currentThread().getName() + " " + count);
//                }
//            }
            @Override
            public void run() {
                synchronized (this) {//синхронайзд блок. синтаксично те саме шо і зверху.
                    // потік доходить до слова синхронізайд і коли мютекс вільний то міняє його на зайнятий.
//                     наступний потік чекає поки мютекс не буде вільний
                    count = 0;
                    for (int i = 0; i < 5; i++){
                    count++;
                    System.out.println(Thread.currentThread().getName() + " " + count);
                    }
                }
            }

        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

}
}

package MultiThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {

//         пул потоків - це механізм який дозволяє керувати певною кількістю потоків.
//         наприклад треба зробити шось 100 потоками.
//         за допомогою пула це можео зробити за допомогою 10 потоків. які візьмуть
//         нову таску при завершенні потоку а не помирають. тобто не створюємо 100 потоків
//         а 10 потоків все перероблять по черзі

//    без пула                       з пулом потоків (3)
//      1                             1 2 3
//      2                             4 5 6
//      3                             7 8 9
//      ...                            ...
     public static void main(String[] args) {
         ExecutorService executorService = Executors.newFixedThreadPool(5);
         for (int i = 0; i < 100; i++) {
             executorService.execute(new MyPool("A"));
             executorService.execute(new MyPool("B"));
             executorService.execute(new MyPool("C"));
             executorService.execute(new MyPool("D"));
             executorService.execute(new MyPool("E"));
         }
         executorService.shutdown();//зупиняємо пул
    }
}
class MyPool extends Thread {
    String name;
    public MyPool(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " "+ name);
        }
    }
}

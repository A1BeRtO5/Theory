package MultiThreads;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        // Мультитредінг - це здатність мови програмування виконувати декілька потоків одночасно.
//             щоб запустити поток потрібно створити класс та екстендити Thread.
//             - потім оверайднути ран
//             - створити обєкт классу і запустити .start
//        або:
//             -створити класс та імплепентувати Runnable
//             - оприділити ран
//             - створити тред але в конструктор передати клас який імплементує
        ThreadExample1 test1 = new ThreadExample1();
        ThreadExample2 test2 = new ThreadExample2();
        test1.start();
        test2.start();
        for (int i = 0; i < 10; i++){
            if (i == 5){
                test1.join(500);
                System.out.println(test1.getState());
            }
        }

    }
}
class ThreadExample1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=20; i++) {
            System.out.println( "1");
        }
    }
}
class ThreadExample2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=20; i++) {
            System.out.println( "2");
        }
    }
}


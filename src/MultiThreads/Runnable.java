package MultiThreads;

public abstract class Runnable {
//    Runnable - це інтрефейс який має метод ран. суть в тому щоб зберігати код у классі
//    який наслідує цей інтерфейс.
//        Переваги:
//    -Більша гнучкість: клас, що реалізує Runnable, може успадковувати інші класи або
//     реалізувати інші інтерфейси.
//    -Зручність у використанні: можна передавати Runnable як аргумент до класу Thread, що
//     дозволяє створювати більш складну логіку потоків.
//        Недоліки:
//    -Потрібно створювати окремий об'єкт, який реалізує Runnable, що може вимагати додаткового
//     коду.
   
public static void main(String[] args) {
    RunnableTest test1 = new RunnableTest();
    Thread threadTest = new Thread(test1);
    threadTest.start();
}

    public abstract void run();
}
class RunnableTest implements java.lang.Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        System.out.println(i);
        }
    }
}
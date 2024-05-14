package exeption;

public class Exeption_Test {
//    Exeption - винятки- ситуація коли виникає помилка або некоректна ситуація.
//        Всі ексепшини це обєкти які наслідуються від Trowable.
//         Буівють cheked i uncheked.
//    Сheked exeptions (перевіряються) - ті які компілятор вимагає обробити або прокинути(throws) дальше.
//        наслідують Exeptions. при обробці треба створити трай кеч або прокинути в
//        сигнатурці метода дальше через throws.
//    Unchecked exeption - не вимагають обовязкової обробки або прокидання.(при запуску)
//        наслідують Runtime Exeption Eroor.
//
//    Cheked - винятки - можна.
//    Uncheked - ерори - не можна.
//    throw - викидає(створює) exeption.
//    throws - прокидає exeption дальше (пишеться в сигнатурі метода).

    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        if (b > 1) try {
            throw new MyExeption();//спрацює коли б>1 і !=1
        } catch (MyExeption e) {
            System.out.println(" b > 5");        }
        try {
            System.out.println(a/b);//спрацює коли б ==0;
        } catch (Exception e){
            System.out.println("ти ділиш на 0");
        }
    }
    
} class MyExeption extends Exception {
    public MyExeption() {
    }

    public MyExeption(String message) {
        super(message);
    }

    public MyExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExeption(Throwable cause) {
        super(cause);
    }

    public MyExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

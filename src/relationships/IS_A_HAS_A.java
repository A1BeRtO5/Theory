package relationships;

public class IS_A_HAS_A {
//    IS A - це віношення яке використовує наслідування.
//        Lion is an Animal
//            class Animal{};
//            class Lion extends Animal {};

//    HAS A - відношення яке вказує на те, що об'єкт містить (має) інший об'єкт
//    як частину своєї структури або функціоналу. буває три види

//Асоціація - відношення коли один клас має багато об'єктів.
//    один кінь має багато сідел
    public class Halter {}
    public class Horse{
        private Halter halter1;
        private Halter halter2;
        private Halter halter3;
    }
//Агрегація - відношення коли один об'єкт є частиною іншого.
//    одне сідло на багатьох конях
//
    public class Horse1{
        private Halter halter;
//
        public Horse1(Halter halter){
        this.halter = halter;
        }
    }

//Композиція - об'єкт є частиною іншого але не може належати іншому.

    public class Horse2{
        private Halter halter;
//
        public Horse2(){
        this.halter = new Halter();
        }
    }
}

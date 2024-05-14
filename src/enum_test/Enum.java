package enum_test;

public class Enum {
    //    Enum - це спеціальний вид класу, набір іменованих констант.(перечислення)
//    для створення пишемо замість класу, змінні капсом.
//    Завдяки ньому ми можемо зробити свій тип аналог буліану
//    але де не тільки два значення а стільки скільки треба.
    public static void main(String[] args) {
        Boolean2_0 b1 = new Boolean2_0();
        b1.state = Boolean2_0.State.MAYBE;
        System.out.println(b1);
    }
}
class Boolean2_0{
    @Override
    public String toString() {
        return "state=" + state;
    }

    State state;
    enum State {
        TRUE, FALSE, MAYBE;
    }
}
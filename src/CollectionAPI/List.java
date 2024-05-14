package CollectionAPI;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    //    List - упорядкований список, можуть повторюватись, мають порядковий номер.
    public static void main(String[] args) {
//        ArrayList - той самий масив але з не фіксованою довжиною.
//                - є доступ за індексом
//                - автоматично збільшує масив акщо він заповнений
//                при створенні має capacity(10) потім +50% копіюється в новий.
//        LinkedList - (ланцюжок) реалізація інтерфейсу list яка зберігає в вигляді звязного списку.
//        кожен елемент має посилання на попередній і наступний елемент.
//                - ефективний для вставки та видалення елементів на початку і середині
//                - для доступу по індексу вимагає більше ресурсів ніж арей ліст



        Komunisty komunist1 = new Komunisty("Putin_loh", 23);
        Komunisty komunist2 = new Komunisty("Putin_loh", 32);
        Komunisty komunist3 = new Komunisty("Putin_loh", 54);
        Komunisty komunist4 = new Komunisty("Putin_loh", 22);
        Komunisty komunist5 = new Komunisty("Putin_loh", 11);

        ArrayList<Komunisty> arrayList = new ArrayList<>();
        arrayList.add(komunist1);
        arrayList.add(komunist2);
        arrayList.add(komunist3);
        arrayList.add(komunist4);
        arrayList.add(komunist5);
        System.out.println(arrayList);

        LinkedList<Komunisty> linkedList = new LinkedList<>();
        linkedList.add(komunist1);
        linkedList.add(komunist2);
        linkedList.add(komunist3);
        linkedList.add(komunist4);
        linkedList.add(komunist5);
        System.out.println(linkedList);
    }
}
class Komunisty{
    String partiya;
    int number;

    @Override
    public String toString() {
        return  partiya +" "+  number;
    }

    public Komunisty(String partiya, int number) {
        this.partiya = partiya;
        this.number = number;
    }
}

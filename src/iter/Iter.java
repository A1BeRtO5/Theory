package iter;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Iter {
//    Iterator - це інтерфейс який допомагає послідовно перебирати елементи в колекції.
//              hasNext() - повертає true, якщо ітератор має ще елементи для повернення.
//              next() - повертає наступний елемент у послідовності.

//    Iterable - це інтерфейс, який вказує, що об'єкт може бути перебраним, має мати метод
//              ітератор якай повертає ітератор

    public static void main(String[] args) {
        Integer[] array = new Integer[] {62, 33, 45, 76, 87, 67, 45, 40, 24, 63, 70, 32};
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, array);

//        for (Integer i : list) {
//            System.out.print(i+" ");
//        }
        for (int i = 0; i<list.size(); i++) {   //те саме шо і ітератор |
            System.out.print(list.get(i)+ " "); //                      |
        }                                       //                      |
        Iterator<Integer> iter = list.iterator();//                    \ /
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        while (iter.hasNext()){//видалення за константний час
            int item = iter.next();
            if (item > 40){
                iter.remove();
            }
            System.err.println(iter);


        }

    }
}

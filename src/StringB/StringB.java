package StringB;

import java.util.StringJoiner;

public class StringB {
//    StringBuffer- Це клас, який був представлений в Java з початку і призначений для
//                  маніпулювання рядками.
//                  Методи класу StringBuffer синхронізовані.(безпечні для мультитреду)
//
//                  StringBuffer частіше використовується в тих випадках, коли потрібно працювати
//                  з рядками в багатопотоковому середовищі.
//
//    StringBuilder є схожим на StringBuffer, за винятком того, що методи класу не синхронізовані.
//                  Це робить StringBuilder більш швидким за StringBuffer, оскільки він не має
//                  накладних витрат на синхронізацію.

//                  StringBuilder часто використовується в тих випадках, коли потрібно працювати
//                  з рядками в однопотоковому середовищі для досягнення кращої продуктивності.
//
//    StringJoiner- був введений в Java 8 для зручного об'єднання рядків з роздільниками.

//                  Він дозволяє вказати початковий роздільник, кінцевий роздільник і роздільник
//                  між кожною парою значень.

//                  Цей клас особливо корисний для об'єднання елементів масиву або колекції в
//                  один рядок з заданими роздільниками.
    // стрінгбілдер для однопотоку стрінгбаффер для багатопотоку
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("lalala text ");
        sb.append("append text ");
        sb.append("append text!!! ");
        System.out.println(sb);
        sb.delete(0,6);// видаляємо з перші 6 символів
        System.out.println(sb);

        System.out.println(sb.reverse());
        System.out.println(sb.reverse().append("end"));

//  StringJoiner sj = new StringJoiner(", ");//після кожного доданого емеиента буде
    StringJoiner sj = new StringJoiner(", ", "[", "]");// те шо в дужках
        sj.add("first");
        sj.add("second");
        sj.add("third");
        sj.setEmptyValue("nothing");//виведе це коли sj буде пустий
        System.out.println(sj);


    }

}

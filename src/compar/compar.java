package compar;

import java.util.*;

public class compar {
//    Comparable - інтерфейс який має метод compare To. Це метод який має повертати 1 0 -1;
//    Comparatоr - інтерфейс який має метод compare.
//      Те саме що і Comparable але тут в метод передаються два параметри
//    для компаратора треба створити новий клас.
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("b");
    list.add("a");
    list.add("B");
    System.out.println("before sort");
    System.out.println(list);
    Collections.sort(list);//сортуємо колкцію. natural order натуральний перелік від а до я
    System.out.println("after sort");
    System.out.println(list);

    Person p1 = new Person("Kolya",23);
    Person p2 = new Person("Vova",34);
    Person p3 = new Person("Olya",67);
    Person p4 = new Person("Vika",49);
    List<Person> personList = new ArrayList<>();
    personList.add(p1);
    personList.add(p2);
    personList.add(p3);
    personList.add(p4);
        System.out.println("before sort");
        System.out.println(personList);
        System.out.println("after sort");
        //Collections.sort(personList);-помилка бо джава хз як сортувати. по чому? алфавіту? номеру?
        Collections.sort(personList, new ageComparator());
        System.err.println(personList);


    }
}
class Person implements Comparable<Person>{
    String name;
    int age;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        return this.age - o.age; // int age - Person o.age
    }
}
class ageComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1,Person o2) {
        return o1.age - o2.age;
    }
}


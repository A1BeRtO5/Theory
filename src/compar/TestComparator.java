package compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Murchik", 6);
        Cats cat2 = new Cats("Boris", 1);
        Cats cat3 = new Cats("Umka", 4);
        Cats cat4 = new Cats("Adam", 2);
        List<Cats> catsList = new ArrayList<>();
        catsList.add(cat1);
        catsList.add(cat2);
        catsList.add(cat3);
        catsList.add(cat4);
        Collections.sort(catsList, new ageComp());
        System.out.println(catsList);
        Collections.sort(catsList, new nameComp());
        System.out.println(catsList);

    }
}
class ageComp implements Comparator<Cats>{

    @Override
    public int compare(Cats o1, Cats o2) {
        return o1.number - o2.number;
    }
}
class Cats implements Comparable<Cats>{
    String name;
    int number;

    public Cats(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name=" + name + " number=" + number;
    }

    @Override
    public int compareTo(Cats o) {
        return this.number - o.number;
    }
}
class nameComp implements Comparator<Cats>{

    @Override
    public int compare(Cats o1, Cats o2) {
        return o1.name.compareTo(o2.name);
    }
}


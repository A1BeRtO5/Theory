package compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        Animal cats = new Animal("cats", 45);
        Animal dogs = new Animal("dogs", 23);
        Animal pigs = new Animal("pigs", 64);
        Animal cows = new Animal("cows", 14);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cats);
        animalList.add(dogs);
        animalList.add(pigs);
        animalList.add(cows);
        System.out.println(animalList);
        Collections.sort(animalList);
        System.out.println(animalList);
    }
}
class Animal implements Comparable<Animal>{
    String name;

    public Animal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return  name + " " + number;
    }

    int number;

    @Override
    public int compareTo(Animal o) {
        return this.number - o.number;
    }
}

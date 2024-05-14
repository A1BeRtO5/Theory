package clonable;

import java.util.Objects;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man m1 = new Man("Ivan", 29);
        Man m2 = m1;
        Man m3 = (Man) m1.clone();

        System.out.println(m1==m2);//
        System.out.println(m1.equals(m2));//true - і там і там ссилка на це - new Man("Ivan", 29);

        System.out.println(m3.equals(m1));//true
        System.out.println(m3.equals(m2));//true

        System.out.println(m1==m3);// false бо різні ссилки в памяті - два різні файли клон і обєкт.
        System.out.println(m1.equals(m3));//true - провіряє значення а не ссилку.
//         == провіряє ссилку
//        equals провіряє значення

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
 class Man implements Cloneable{
    String name;
    int age;

     public Man(String name, int age) {
         this.name = name;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Man{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Man man)) return false;
         return age == man.age && Objects.equals(name, man.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, age);
     }

     public Man(String name) {
         this.name = name;

     }
     public Object clone() throws CloneNotSupportedException {
         return super.clone();
     }
 }
package oop;

public class Static {
//    Static - модифіктаор доступу що застосовується до поля, блоку, методу
//    або всього класу. Вказує на належність метода до класу.

//    Викликається лише через назву класу.
//    Може використовуватись як перевірка обєкта,
//    бо його можна викликати до створення обєкта.
    public static void main(String[] args) {
        System.out.println(People.amount_static);

    People person1 = new People("Oleg", 34);
    People person2 = new People("Vika", 23);
    People person3 = new People("Olga", 45);
    People person4 = new People("Igor", 28);
        System.out.println(People.amount_static);
        System.out.println(person4.amount_usual);
//    person1.amount_static = 5;//неправильно
//        People.amount_static =1; так правильно
    }
}
class People {
    String name;
    int age;
   static int amount_static = 0;// статік кількість
    int amount_usual = 0;//звичайна кількість
    public People(String name, int age){
        this.name = name;
        this.age = age;
        amount_usual++;
        amount_static++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package oop;

public class Class_and_more {
//    Клас - це шаблон, тип данних по якому створюється об'єкт.
//    ******************************************************************
    class Person{
        int age;
        String name;

    public Person(int age, String name) {//конструктор
        this.age = age;
        this.name = name;
    }
}
// **********************************************************************
//    Об'єкт - екземпляр класу, змінна яка створена по шаблону класу.
    Person Igor = new Person(34, "Igor");
//   A ***************************************************************************

//    Конструктор - це метод який викликається при створенні екземпляра класа та має таку саму назву як клас.
//    public Person(int age, String name) {//конструктор
//        this.age = age;
//        this.name = name;
}
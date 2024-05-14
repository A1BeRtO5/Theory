package oop;

public class Abstract_class_and_interface {
//    Абстрактний клас - який описує певний стан та поведінку яку матимуть майбутні
//    класи — спадкоємці абстрактного класу.

//    Інтерфейс - це (контракт) абстракнтий клас  в якому не можна ініціалізувати змінні,
//    лише як finall ststic і може мати методи але без тіла.

//    Інтерфейс описує лише поведінку. Він не має стану. лише методи
//    А в абстрактного класу стан є: він описує і те, й інше. методи + поля

//    Якщо треба описати поведінку то інтерфейс
//    Якщо треба описати шаблон класу то астракнтий клас

//    Car c1 = new Car() - помилка

abstract class Car{
    private String model;
    private String color;
    private int maxSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
}

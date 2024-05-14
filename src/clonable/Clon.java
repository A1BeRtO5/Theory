package clonable;

public class Clon {
//    Clonable -інтерфейс-маркер, який має метод clone. Використовують для клонування об'єктів.

//    обовязково маємо імплементувати Cloneable і оверайднути метод clone.

    public static void main(String[] args) {
        Terminator t1 = new Terminator();// ссилка йде сюди - new Terminator();
        Terminator t2 = testlink(t1);
        t1.setModel("T-1000");
        t2.setModel("T-3000");

        System.out.println(t1.getModel());
        System.out.println(t2.getModel());
    }
    public static Terminator testlink(Terminator t) {// ссилка йде сюди також - new Terminator(); тому коли ми
                                               // хочемо використовувати не сам обєкт а його клон то клонуємо
        Terminator t2 = null;
        try {
             t2 = (Terminator) t.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t2);
        return t2;
    }
}
class Terminator implements Cloneable{
    private String model;
    private String shortName;
    @Override
    public Object clone() throws CloneNotSupportedException { //змінюємо протект на паблік
        return super.clone();
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }



}
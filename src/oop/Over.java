package oop;

public class Over {

//    @Override - це аннотація яка вказує що метод переопреділений з суперкласу
//    якого наслідує;

    @Override
    public String toString() {
        return "lalala";
    }

//Overload - це перегрузка, здатність метода мати одинакові назви але різні аргументи.
//        поліморфізм

    public Over(int a) {
    }
    public Over(String a) {
    }
    public Over(char a) {
    }
}
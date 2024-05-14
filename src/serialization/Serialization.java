package serialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        serialization();
        deserialization();
    }
    //Serialization (серіалізація) - це процес, який переводить обєкт в послідовність
    // байтів  за якими його потім можна відновити.
    // Виконується через інтерфейс Serializable.

    // Серіалізацію використовують для збереження стану обєкта та його відновлення,
    // а також для передачі обєктів через мережу чи збереження їх у файлі.
     private static  void  serialization(){
         try {
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SERIALIZATION.txt"));// створюємо файл куди будемо записувти байт код
             Serialization_Test serializationTest1 = new Serialization_Test("test" , 1); // дані які будемо серіалізовувати
             oos.writeObject(serializationTest1);
         } catch (Exception e) {
             System.out.println(e);
         }
     }
     private static void deserialization() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SERIALIZATION.txt"));
            Serialization_Test deserializationTest = (Serialization_Test) objectInputStream.readObject();
            System.out.println(deserializationTest.count +"  " + deserializationTest.name);
        } catch (Exception e){
            System.out.println(e);
        }
     }
}
class Serialization_Test implements Serializable {
    String name;
    int count;

    Serialization_Test(String name, int count) {
        this.name = name;
        this.count = count;
    }
}

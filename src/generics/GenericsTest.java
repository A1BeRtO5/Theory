package generics;

public class GenericsTest {
//    generics- в джава це механізм який дозволяє створювати класи інтерфейси та методи які
//              будуть працювати з конкретними типами данних.
}
class Animal<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
         Animal<Integer> integerAnimal = new Animal<>();
         integerAnimal.setValue(13);
         System.out.println(integerAnimal.getValue());

         Animal<String> stringAnimal = new Animal<>();
         stringAnimal.setValue("Cat");
        System.out.println(stringAnimal.getValue());
    }
}

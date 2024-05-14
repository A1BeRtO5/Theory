public class Classclass {
    public static void main(String[] args) {
        H h = new H();
        Class<?> clazz = int.class;
        System.out.println(clazz.isInterface());
        System.out.println(clazz.isArray());
        System.out.println(clazz.isEnum());
        System.out.println(clazz.isPrimitive());
    }
}
class H {

}

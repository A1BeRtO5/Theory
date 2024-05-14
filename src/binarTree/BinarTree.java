package binarTree;

public class BinarTree {
    public static void main(String[] args) {

//    binar tree - бінарне дерево - це структура даних у вигляді дерева, в якій кожен вузол
//    може мати не більше двох дочірніх вузлів, які називаються лівим та правим. (TreeMap, TreeSet)
    Tree treeRoot = new Tree(20,
                            new Tree(7,
                                    new Tree(4, null, new Tree(6)), new Tree(9)),
                            new Tree(35,
                                    new Tree(31, new Tree(28),null),
                                    new Tree(40, new Tree(38),new Tree(52))));
        System.out.println(treeRoot.sum());
    }
}
class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public int sum() {// рекурсивний обхід в глибину
        int sum = value;
        if (left != null) {
            sum += left.sum();
        }
        if (right !=null) {
            sum += right.sum();
        } return sum;
    }

}

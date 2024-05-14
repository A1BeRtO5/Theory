package iter;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("enter word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();

        List<Character> wordList = new LinkedList<>();
        for (char i : word.toCharArray()) {
            wordList.add(i);
        }

        boolean isPalindrome = true;

        ListIterator<Character> iter = wordList.listIterator();
        ListIterator<Character> revers_iter = wordList.listIterator(wordList.size());
        while (iter.hasNext() && revers_iter.hasPrevious()){
            if (iter.next() != revers_iter.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("words: " + word +"= is palindrome");
        } else {
            System.out.println("words: " + word +"= is not palindrome");
        }

    }
}

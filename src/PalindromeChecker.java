import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.println("Palindrome Checker App");
        System.out.println("UC6: Queue + Stack Based Palindrome Check");

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        while(!stack.isEmpty()) {
            if(stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

        scanner.close();
    }
}

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Palindrome Checker App");
        System.out.println("UC5: Stack-Based Palindrome Checker");

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }


        scanner.close();
    }
}

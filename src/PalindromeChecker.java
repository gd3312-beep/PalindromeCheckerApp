import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.println("UC4: Character Array Based Palindrome Check");

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if(characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

        scanner.close();

    }
}

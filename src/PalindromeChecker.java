import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                System.out.println("Palindrome Checker App");
                System.out.println("UC3: Palindrome Check Using String Reverse");

                System.out.print("Enter a word: ");
                String original = scanner.nextLine();

                String reversed = "";

                for(int i = original.length() - 1; i >= 0; i--) {
                    reversed = reversed + original.charAt(i);
                }

                if(original.equals(reversed)) {
                    System.out.println(original + " is a Palindrome");
                } else {
                    System.out.println(original + " is Not a Palindrome");
                }

                scanner.close();

    }
}

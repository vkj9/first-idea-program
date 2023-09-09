import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringToCheck = input.next();
        palindromeString(stringToCheck);
    }

    private static void palindromeString(String stringToCheck) {
        String reverseString = "";
        int n = stringToCheck.length()-1;
        while(n>=0){
            char a = stringToCheck.charAt(n);
            reverseString = reverseString + a;
           n--;
        }
        if(reverseString.equals(stringToCheck)){
            System.out.println("String is palindrome");
        }
        else System.out.println("String is not palindrome");
    }
}

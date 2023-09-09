import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        largerNumber(a,b);
    }

    private static void largerNumber(int a, int b) {
        int c= a-b;
        if(c>0){
            System.out.println("a is grater than b");
        }
        else System.out.println("b is grater than a");
    }
}

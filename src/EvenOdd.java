import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int numberToCheck = input.nextInt();
        oddEven(numberToCheck);
    }

    public static void oddEven(int num){
        if(num%2==0){
            System.out.println("Number is even");
        }
        else
        {System.out.println("Number is odd");}
    }
}

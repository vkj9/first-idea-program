import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in rupees:- ");
        double rupee = input.nextDouble();
        double dollar = rupee*0.012;
        System.out.println("Money value in dollars:- "+dollar);
    }
}

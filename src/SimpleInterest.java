import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int principal = input.nextInt();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter deposit time: ");
        int time = input.nextInt();

        double simpleInterest = principal*rate*time/100;
        System.out.println("Simple interest is : - "+simpleInterest);
    }
}

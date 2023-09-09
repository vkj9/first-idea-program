import java.util.Scanner;

public class ArmstrongBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:- ");
        int a = input.nextInt();
        System.out.println("Enter 2nd number:- ");
        int b = input.nextInt();
        armstrong(a,b);
    }

    private static void armstrong(int a, int b) {
        for(int i=a;i<=b;i++){
            int count =0;
            int x=i;
            while(x!=0){
                x=x/10;
                count++;
            }
            double n=0;
            int y=i;
            while(y!= 0){
                int digit = y%10;
            n= n + Math.pow(digit,count);
            y=y/10;
            }
            if(n==i){
                System.out.println(i+" ");
            }
        }
    }
}

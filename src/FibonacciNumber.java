import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fibonacci(input.nextInt());
    }

    private static void fibonacci(int i) {
        int a=0;
        int b=1;
        int c=0;
       if(i==0)
       {
           System.out.println(a);
       }
       for(int n=2;n<=i;n++){
           c=a+b;
           a=b;
           b=c;
       }
        System.out.println("nth fibonacci number:- " +b);
    }

}

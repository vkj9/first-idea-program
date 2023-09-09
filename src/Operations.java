import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int n1 = input.nextInt();
        System.out.println("Enter second number:- ");
        int n2 = input.nextInt();
        System.out.println("Enter operator:- ");
        char op = input.next().charAt(0);
        int answer = performOperation(n1,n2,op);
        System.out.println(answer);
    }

    private static int performOperation(int n1, int n2, char op) {
        int ans =0;
        if(op=='+'){
            ans = n1+n2;
        } else if (op=='-') {
            ans = n1-n2;
        } else if (op=='*') {
            ans= n1*n2;
        }
        else if(op=='/') {
            ans = n1/n2;
        }
        return ans;
    }
}

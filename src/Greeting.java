import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameToGreet = input.next();
        System.out.println("Hello "+ nameToGreet + " Good morning");

    }
}

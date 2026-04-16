
import java.util.Scanner;

public class charType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("enter a character to check type");

        char c = sc.next().charAt(0);

        if (c >= '0' && c <= '9') {
            System.out.println("give character is a number");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("give character is a lowercase letter");
        } else if (c >= 'A' && c <= 'z') {
            System.out.println("give character is a uppercase letter");
        } else {
            System.out.println("give character is a special character");
        }

    }

}

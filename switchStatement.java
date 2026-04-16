
import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int a = sc.nextInt();
        float b = sc.nextInt();

        System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Reminder");
        System.out.println("enter your choice :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition is :" + (a + b));
                break;
            case 2:
                System.out.println("Substraction is :" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is :" + (a * b));
                break;
            case 4:
                System.out.println("Division is :" + (a / b));
                break;
            case 5:
                System.out.println("Reminder is :" + (a % b));
                break;

            default:
                System.out.println("choice is not available..!");

        }

    }

}

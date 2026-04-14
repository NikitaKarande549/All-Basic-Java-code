import java.util.Scanner;

public class Arithmetic {
    	public static void main(String[] args) 
        {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a and b: ");

		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = a + b;

		System.out.println("addition is : " + c);
		System.out.println("sub is : " + (a - b));
		System.out.println("multiplication is : " + (a * b));
		System.out.println("division is : " + (a/b));
	}
}

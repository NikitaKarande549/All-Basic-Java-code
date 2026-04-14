
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number to count sum of digits: ");
        int num=sc.nextInt();
        int sum=0;
        int rem;

        while(num !=0)
        {
          rem=num%10;
          sum=rem+sum;
          num=num/10;
        }

        System.out.println("sum of digits is : " + sum);

    }
    
}


import java.util.Scanner;

public class character_array {
    public static void main(String[] args) {
        char a[]=new char[3];

        Scanner sc=new Scanner(System.in);
        System.out.println("enter characters into array: ");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next().charAt(0);
        }

        System.out.println("character array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}

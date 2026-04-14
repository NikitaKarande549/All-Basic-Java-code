
import java.util.Scanner;

class primeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if ( num %i == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            System.out.println(num +" "+ "prime number");
        } else {
            System.out.println(num + " "+"not a prime number");
        }

    }

}

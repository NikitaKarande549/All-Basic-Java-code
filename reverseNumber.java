public class reverseNumber {
    public static void main(String[] args)
    {
        int num=12349;
        int rem;
        int rev=0;

        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }

        System.out.println("reverse number is: "+rev);
    }
}

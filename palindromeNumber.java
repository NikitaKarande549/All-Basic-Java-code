public class palindromeNumber {
    public static void main(String[] args)
    {
        int num=121;
        int rem;
        int rev=0;
        int palin=num;
    
        while(num>0)
        {
            rem=num%10;
            rev=rev * 10+rem;
            num=num/10;
        }
        
        System.out.println(rev);
        if(palin==rev)
        {
            System.out.println(palin + " palindrome number");
        }
        else{
            System.out.println(palin + " not a palindrome number");
        }


    }
    
}

public class armstrongNumber {
    public static void main (String[] args)
    {

        int num=154;
        int arm=num;
        int rem;
        int rev=0;

        while (num!=0) 
        { 
            rem=num%10;
            rev=rem*rem*rem+rev;
            num=num/10;
        }


        if(arm==rev){
        System.out.println(arm + " is a armstrong number");
        }
        else{
            System.out.println(arm + " not a armstrong number");
        }

    }
    
}

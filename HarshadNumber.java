public class HarshadNumber {
    public static void main(String[] args) {
		int num=400;           //400
		int rem;
		int sum=0;
		int temp=num;
		
		while(num>0)              //400>0t  40>0   4>0  0>0F
		{
			rem=num%10;          //rem=0   rem=0    rem=4
			
			sum=sum+rem;        //sum=0+0    su0=0+0  sum=0+4
			
			num=num/10;        //num=40     num=4    num=0
		}
		
	    // System.out.println("sum of digit:"+sum);  //sum=0  sum=0  sum=4
		
		
		if(temp%sum==0)                             //400%4==0
		{
			System.out.println("Harshad Number");     //Harshad Number
		}
		else {
			System.out.println("not Harshad number");
		}

	}

}

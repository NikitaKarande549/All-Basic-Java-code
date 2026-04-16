public class fibonnacciSeries {
    public static void main(String[] args) {
        int num=10;

        int num1=0,num2=1;
        int num3;

        System.out.print(num1+" "+num2+" ");

       for(int i=1;i<=num;i++)   
        {
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }


    }
    
}

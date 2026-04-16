public class averageSal {
    public static void main (String[] args)
    {
        int sal[]={1200,45660,567,8900,23451};
        int sum=0;

        for(int i=0; i <sal.length;i++)
        {
            sum=sum+sal[i];
        }

        System.out.println("average of salary is : "+ sum/sal.length);

    }
    
}

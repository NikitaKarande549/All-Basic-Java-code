public class even_odd {
    public static void main(String[] args)
    {
        int b[]={11,34,56,76,885,4,3,2,1};

        System.out.println("even elements of array: ");
        for(int i=0;i<b.length;i++)
        {
            if(b[i] %2 ==0)
            {
                System.out.print(b[i]+" ");
            }
           
        }

        System.out.println();
         System.out.println("odd elements of array: ");
        for(int i=0;i<b.length;i++)
        {
            if(b[i] %2 !=0)
            {
                System.out.print(b[i]+" ");
            }
           
        }
    }
    
}
